package business.abstracts;

import entities.concrete.Customer;

public interface CustomerService {
	public void save(Customer customer) throws Exception;
}
