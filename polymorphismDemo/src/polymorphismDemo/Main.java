package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		EmailLogger emailLogger = new EmailLogger();
		emailLogger.log("Email logland�");
		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger() };
		for (BaseLogger logger : loggers) {
			logger.log("Logland�");
		}
		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
