package kodlamaio.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Sort;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;

import kodlamaio.hrms.dataAccess.abstracts.JobDao;
import kodlamaio.hrms.entities.Dtos.ActiveJobDto;

import kodlamaio.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService {

	private JobDao jobDao;
	
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
		
	}
	
	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<List<Job>>(this.jobDao.findAll(),"Başarıyla listelendi.");
	}

	@Override
	public Result add(Job job) {
	
		this.jobDao.save(job);
		return new SuccessResult("Başarıyla eklendi.");
	}

	@Override
	public DataResult<List<ActiveJobDto>> getByIsActive() {
		List<Job> jobs =	this.jobDao.getByIsActive(true);
		List<ActiveJobDto> activeJobs = new ArrayList<ActiveJobDto>();
			
			for (Job job : jobs) {
				for (ActiveJobDto activeJobDto : activeJobs) {
					activeJobDto.setJobPosition(job.getJobName());						
					activeJobDto.setCreatedDate(job.getCreatedDate());
					activeJobDto.setApplicationDeadline(job.getApplicationDeadline());
				}
			}
		
		return new SuccessDataResult<List<ActiveJobDto>>(activeJobs,"Başarıyla listelendi.");
	}

	@Override
	public DataResult<List<ActiveJobDto>> getByEmployer_EmployerId(int employerId) {
		
		List<Job> jobs =	this.jobDao.getByEmployer_Id(employerId);
		List<ActiveJobDto> activeJobs = new ArrayList<ActiveJobDto>();
			
			for (Job job : jobs) {
				for (ActiveJobDto activeJobDto : activeJobs) {
					activeJobDto.setJobPosition(job.getJobName());
					activeJobDto.setEmployerName(job.getEmployer().getCompanyName());
					activeJobDto.setCreatedDate(job.getCreatedDate());
					activeJobDto.setApplicationDeadline(job.getApplicationDeadline());
				}
			}
		
		
		return new SuccessDataResult<List<ActiveJobDto>>(activeJobs,"Başarıyla listelendi.");
		
	}

	@Override
	public DataResult<List<Job>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"createdDate");
		return new SuccessDataResult<List<Job>>(this.jobDao.findAll(sort),"Başarılı");
	}

	@Override
	public Result update(Job job) {
	
		Job updatedJob = this.jobDao.getOne(job.getId());
		this.jobDao.delete(updatedJob);	
		
		this.jobDao.save(job);
		return new SuccessResult("Başarıyla güncellendi.");
	}



}
