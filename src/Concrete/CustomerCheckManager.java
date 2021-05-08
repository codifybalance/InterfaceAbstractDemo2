package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
		//tr.gov.nvi.tckimlik.WS.KPSPublicSoap client = new  KPSPublicSoap();
	}

}
