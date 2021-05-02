package Inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber="12345";
		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.customerNumber="789645";
		CustomerManager customerManager=new CustomerManager();
		SendikaCustomer sendikaCustomer=new SendikaCustomer();
		sendikaCustomer.customerNumber="999999";
		Customer[]customers= {engin,sendikaCustomer,hepsiburada};
		customerManager.addMultiple(customers);
	}

}
