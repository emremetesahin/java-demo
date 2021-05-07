package Main;

import Main.business.abstracts.AuthService;
import Main.business.abstracts.UserService;
import Main.business.concretes.AuthManager;
import Main.business.concretes.UserManager;
import Main.core.adapters.GoogleVerifyAdapter;
import Main.dataAccess.concretes.InMemoryUserDao;
import Main.entity.concretes.User;
import Main.googleVerify.GoogleAuthentication;

public class Main {

	public static void main(String[] args) {
		User user1=new User(1,"Emre","Þahin","cagla@gmail.com","123456");
		System.out.println(user1.getName());
		UserService userManager=new UserManager(new InMemoryUserDao());
		AuthService authManager=new AuthManager(userManager);
		AuthService googleAuth=new GoogleVerifyAdapter();
		
		authManager.register(user1);
		authManager.login("emresahin@gmail.com","123");
		googleAuth.register(user1);
		googleAuth.login("emresahin@gmail.com","123deneme");
		userManager.verify(user1, true);
		

	}

}
