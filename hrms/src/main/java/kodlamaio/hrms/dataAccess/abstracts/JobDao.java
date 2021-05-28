package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job,Integer>{

 List<Job> getByIsActive(Boolean isActive);
 
 List<Job> getByEmployer_EmployerId(int employerId);
 
 
 
	
}
