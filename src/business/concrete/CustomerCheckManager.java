package business.concrete;

import business.abstracts.CustomerCheckService;
import entities.concrete.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer){
		return true;
		
	}

}
