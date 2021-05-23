package kodlamaio.hrms.business.serviceAdapters;

import kodlamaio.hrms.business.abstracts.UserCheckService;
import kodlamaio.hrms.entities.concretes.Employee;


public class MernisServiceFakeAdapter implements UserCheckService {


	@Override
	public boolean IfUserRealPerson(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
