import business.abstracts.CustomerManager;
import business.concrete.NeroCustomerManager;
import business.concrete.StarbucksCustomerManager;
import core.utilities.adapters.MernisServiceAdapter;
import entities.concrete.Customer;

public class main {

	public static void main(String[] args) throws Exception {
		CustomerManager customerManager = 
				new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"semih","acar","1996","1111111111"));
	}

}
