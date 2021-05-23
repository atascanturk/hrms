package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.Employee;


public interface EmployeeValidationService {
	public void validate(Employee employee) throws Exception;
}
