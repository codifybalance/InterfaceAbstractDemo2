package Concrete;
import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;

import java.util.Date;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager{
	private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this._customerCheckService = customerCheckService;
	}
	
	public void Save(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson (customer)) {
			super.Save(customer);
		}else {
			System.out.println("Not a valid person");
		}
	}
}
