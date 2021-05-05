package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) 
	{
		if(customer.NationalityId=="300")
		{
			return true;
		}
		else
		{
			return false;
		}
	}


}
