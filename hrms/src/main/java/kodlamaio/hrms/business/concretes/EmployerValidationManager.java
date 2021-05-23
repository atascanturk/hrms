package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployerValidationService;
import kodlamaio.hrms.core.utilities.consts.Messages;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.utilities.tools.RunTools;
import kodlamaio.hrms.entities.concretes.Employer;

public class EmployerValidationManager implements EmployerValidationService {

	public EmployerValidationManager() 
	{
		
	}
	
	@Override
	public void validate(Employer employer) throws Exception {
		Result[] results = RunTools.runValidationRules(this.checkCompanyNameNotNull(employer.getCompanyName()),
				this.checkWebSiteNotNull(employer.getWebAddress()), this.checkEmailNotNull(employer.getEmail()),
				this.checkTelNotNull(employer.getPhoneNumber()), this.checkPasswordNotNull(employer.getPassword()),
				this.checkPasswordAgainNotNull(employer.getPasswordAgain()));
		for (Result result : results) {
			if (!result.isSuccess()) {
				throw new Exception(result.getMessage());
			}
		}
		
	}
	
	private Result checkCompanyNameNotNull(String companyName) {
		if (companyName.isEmpty() || companyName == null) {
			return new ErrorResult(Messages.firstNameCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}
	
	private Result checkWebSiteNotNull(String webSite) {
		if (webSite.isEmpty() || webSite == null) {
			return new ErrorResult(Messages.firstNameCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}
	
	private Result checkEmailNotNull(String email) {
		if (email.isEmpty() || email == null) {
			return new ErrorResult(Messages.firstNameCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}
	
	private Result checkTelNotNull(String tel) {
		if (tel.isEmpty() || tel == null) {
			return new ErrorResult(Messages.firstNameCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}
	
	private Result checkPasswordNotNull(String password) {
		if (password.isEmpty() || password == null) {
			return new ErrorResult(Messages.firstNameCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}
	
	private Result checkPasswordAgainNotNull(String passwordAgain) {
		if (passwordAgain.isEmpty() || passwordAgain == null) {
			return new ErrorResult(Messages.firstNameCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}

}
