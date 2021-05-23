package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerValidationService {
	public void validate(Employer employer) throws Exception;
}
