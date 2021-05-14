package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean  CheckIfRealPerson(Customer customer) {
		boolean result = true ;
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			result= client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName(),
					customer.getLastName(),
					customer.getDateOfBirth().getYear());
			
		}
		catch (RemoteException e) {
			result=false;
			e.printStackTrace();
		}
		return result;
	}
}
			
			
