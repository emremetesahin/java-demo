package Main.core.utils.helpers;

import Main.entity.concretes.User;

public class UserVerifyHelper {
	public static void sendMail(User user) 
	{
		System.out.println("Mail gönderildi"+user.getMail());
	}
	public static void verify(User user,Boolean verified) {
		if(verified)
		{
			user.setStatus(true);
			System.out.println(user.getName()+" kullanýcý aktifleþtirildi");
		}
		else
		{
			System.out.println("Baðlantý hatalý lütfen tekrar deneyiniz");
		}
		
	}

}
