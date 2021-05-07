package Main.googleVerify;

import Main.entity.concretes.User;

public class GoogleAuthentication {
	public void login(String email,String password)
	{
		System.out.println("Google hesabýna baðlantý baþarýlý"+email);
	}
	public void register(User user)
	{
		System.out.println("Google ile kayýt olundu"+user.getMail());
	}

}
