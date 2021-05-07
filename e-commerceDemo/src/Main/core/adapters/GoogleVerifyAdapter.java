package Main.core.adapters;

import Main.business.abstracts.AuthService;
import Main.entity.concretes.User;
import Main.googleVerify.GoogleAuthentication;

public class GoogleVerifyAdapter implements AuthService {
	private GoogleAuthentication googleAuth;
	public GoogleVerifyAdapter() {
		
		this.googleAuth =  new  GoogleAuthentication();
	}

	@Override
	public void login(String mail, String password) {
		if (mail == "emresahin@gmail.com" && password == "123deneme") {
			this.googleAuth.login(mail, password);

		} else {
			System.out.println("Google ile giriþte hata oldu tekrar deneyiniz");
		}

	}

	@Override
	public void register(User user) {
		this.googleAuth.register(user);

	}
}
