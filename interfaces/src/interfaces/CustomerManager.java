package interfaces;

public class CustomerManager {
	private Logger[] loggers;


	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M�t�eri eklendi " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
		
		

	}

	public void delete(Customer customer) {
		System.out.println("M�t�eri silindi " + customer.getFirstName());
		Utils.runLoggers(null, customer.getFirstName());
	
	}
}
