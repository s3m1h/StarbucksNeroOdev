package business.concrete;

import business.abstracts.CustomerManager;
import core.utilities.adapters.MernisServiceAdapter;
import entities.concrete.Customer;

public class NeroCustomerManager extends CustomerManager{
	private MernisServiceAdapter mernisServiceAdapter;
	
	public NeroCustomerManager(MernisServiceAdapter mernisServiceAdapter) {
		this.mernisServiceAdapter = mernisServiceAdapter;
	}
	
	
	@Override
	public void save(Customer customer) throws Exception {
		if(mernisServiceAdapter.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			throw new Exception("geçerli bir kullanıcı değil");
		}
		
	}
}
