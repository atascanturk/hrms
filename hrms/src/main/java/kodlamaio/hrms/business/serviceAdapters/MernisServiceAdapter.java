package kodlamaio.hrms.business.serviceAdapters;



import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserCheckService;
import kodlamaio.hrms.entities.concretes.Employee;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisServiceAdapter implements UserCheckService{

	
	@Override
	public boolean IfUserRealPerson(Employee employee) {
		KPSPublicSoapProxy proxy =new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(employee.getIdentityNumber()), employee.getFirstName().toUpperCase() , employee.getLastName().toUpperCase(),employee.getDateOfBirth().getYear());
			
		} catch (Exception e) {
			System.out.println("Not a valid user");
		}
		
		return result;
	}
	
	
	
}
