package business.abstracts;

import entities.concrete.Customer;


public abstract class CustomerManager implements CustomerService{
	@Override
	public void save(Customer customer) throws Exception{
		System.out.println(customer.getFirstName() + " müşterisi eklendi.");
		
	}
	
}
