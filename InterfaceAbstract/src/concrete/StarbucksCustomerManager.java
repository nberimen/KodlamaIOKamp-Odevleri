package concrete;

import abstractt.BaseCustomerManager;
import abstractt.ICustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService checkService;
	
	public StarbucksCustomerManager(ICustomerCheckService checkService) {
		this.checkService=checkService;
	}
	
	public void save(Customer customer) {
		
			if(checkService.checkIfRealPerson(customer)) {
				super.save(customer);
			}else {
				
			}
			
		
		
		
	}

	
		
	
}
