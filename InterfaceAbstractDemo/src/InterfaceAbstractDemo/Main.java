package InterfaceAbstractDemo;

import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new CustomerCheckManager());
		Customer customer1=new Customer();
		customer1.FirstName="Emre";customer1.LastName="Þahin";
		customer1.NationalityId="300";customer1.DateOfBirth="21/06/1997";
		customerManager.save(customer1);
	}

}
