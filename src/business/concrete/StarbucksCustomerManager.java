package business.concrete;
import business.abstracts.CustomerCheckService;
import business.abstracts.CustomerManager;
import entities.concrete.Customer;



public class StarbucksCustomerManager extends CustomerManager{
	private CustomerCheckService customerCheckService;
	@Override
	public void save(Customer customer) throws Exception {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			save(customer);
		}
		else {
			throw new Exception("geçerli bir kullanıcı değil");
		}
		
	}

}
