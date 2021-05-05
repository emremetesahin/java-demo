package InterfacesDemo;

public class MySqlCustomerDal implements CustomerDal {

	@Override
	public void add() {
		System.out.println("Mysql eklendi");
	}

}
