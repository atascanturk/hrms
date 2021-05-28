package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.Dtos.ActiveJobDto;
import kodlamaio.hrms.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs/")
public class JobsController {

	private JobService jobService;
	
	@Autowired
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}

	@GetMapping("getall")
	public DataResult<List<Job>> getAll(){
		return this.jobService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Job job){
		this.jobService.add(job);
		return new SuccessResult ("Başarıyla eklendi");
	}
	
	@PostMapping("update")
	public Result update(@RequestBody Job job){
		this.jobService.update(job);
		return new SuccessResult ("Başarıyla güncellendi");
	}
	
	@GetMapping("getAllByActived")
	public DataResult<List<ActiveJobDto>> getAllByActived(){
		return this.jobService.getByIsActive();
	}
	
	@GetMapping("getAllByEmployerId")
	public  DataResult<List<ActiveJobDto>> getAllByEmployerId(@RequestParam int employerId){
		return this.jobService.getByEmployer_EmployerId(employerId);
	}
	
	@GetMapping("getAllDescDate")
	public DataResult<List<Job>> getAllSorted() {
		
		return this.jobService.getAllSorted(); 
	}
	
}
