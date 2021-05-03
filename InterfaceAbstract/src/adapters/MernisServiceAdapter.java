package adapters;

import abstractt.ICustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		try {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),
				 customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
		}catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		return false;
	}

}
