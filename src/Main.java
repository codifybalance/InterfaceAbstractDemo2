import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Adapters.MernisServiceAdapter;
import java.util.Date;

import Entities.Customer;
public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
	//	Customer customer= new Customer(1,"Ayca","Aydemir",(1993,11,29),"20903286488");
	//	Customer customer= new Customer();
    // customer.FirstName="Ayça";
	//	Date d1= new Date(1993);	
		
		Customer customer1= new Customer(1993,"Ayca","Aydemir","20903286488");
		customerManager.Save(customer1);
	}


	
}
