package Main.core.utils.helpers;

import Main.entity.concretes.User;

public class UserVerifyHelper {
	public static void sendMail(User user) 
	{
		System.out.println("Mail g�nderildi"+user.getMail());
	}
	public static void verify(User user,Boolean verified) {
		if(verified)
		{
			user.setStatus(true);
			System.out.println(user.getName()+" kullan�c� aktifle�tirildi");
		}
		else
		{
			System.out.println("Ba�lant� hatal� l�tfen tekrar deneyiniz");
		}
		
	}

}
