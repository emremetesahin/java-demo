package InterfacesDemo;

public class OracleCustomerDal implements CustomerDal {

	@Override
	public void add() {
		System.out.println("Oracle Eklendi");
		
	}

}
