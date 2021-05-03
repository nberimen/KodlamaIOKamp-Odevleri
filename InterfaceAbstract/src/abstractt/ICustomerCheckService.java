package abstractt;

import entities.Customer;

public interface ICustomerCheckService {

	boolean checkIfRealPerson(Customer customer);
}
