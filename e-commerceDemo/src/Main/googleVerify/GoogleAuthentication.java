package Main.googleVerify;

import Main.entity.concretes.User;

public class GoogleAuthentication {
	public void login(String email,String password)
	{
		System.out.println("Google hesab�na ba�lant� ba�ar�l�"+email);
	}
	public void register(User user)
	{
		System.out.println("Google ile kay�t olundu"+user.getMail());
	}

}
