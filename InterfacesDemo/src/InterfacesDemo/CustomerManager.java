package InterfacesDemo;

public class CustomerManager {
	private CustomerDal customerDal;

	public CustomerManager(CustomerDal customerDal)
	{
		this.customerDal=customerDal;
	}
	public void add() {
		System.out.println("M��teri Kaydedildi");
		customerDal.add();
	}

}
