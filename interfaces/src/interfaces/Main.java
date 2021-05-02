package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers=new Logger[] {new FileLogger(),new DatabaseLogger(),new SmsLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		Customer emre=new Customer(1,"Emre","Þahin");
		customerManager.add(emre);
	}

}
