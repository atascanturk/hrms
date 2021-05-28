package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.Dtos.ActiveJobDto;
import kodlamaio.hrms.entities.concretes.Job;

public interface JobService {
 DataResult<List<Job>> getAll();
 DataResult<List<Job>> getAllSorted();
 Result add(Job job);
 Result update(Job job);
 DataResult<List<ActiveJobDto>> getByIsActive(); 
 DataResult<List<ActiveJobDto>> getByEmployer_EmployerId(int employerId);

}
