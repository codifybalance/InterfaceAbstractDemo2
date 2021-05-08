package Adapters;
import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@SuppressWarnings("deprecation")
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

}
