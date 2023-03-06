package core.utilities.adapters;

import business.abstracts.CustomerCheckService;
import entities.concrete.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws Exception{
		KPSPublicSoapProxy mernis = new KPSPublicSoapProxy();
		return mernis.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationaltyId()),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(),
				Integer.parseInt(customer.getDateOfBirth())
				
				);
	}

}
