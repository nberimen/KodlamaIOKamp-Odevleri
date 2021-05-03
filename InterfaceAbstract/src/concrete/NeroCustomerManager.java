package concrete;

import abstractt.BaseCustomerManager;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	public void save(Customer customer) {
		System.out.println("Saved to DB : "+customer.getFirstName());
	}
}
