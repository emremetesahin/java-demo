package Main.business.concretes;

import Main.business.abstracts.AuthService;
import Main.business.abstracts.UserService;
import Main.business.validationRules.UserValidator;
import Main.core.rules.BusinessRules;
import Main.core.rules.ValidationRules;
import Main.core.utils.helpers.UserVerifyHelper;
import Main.entity.concretes.User;

public class AuthManager implements AuthService {
	private UserService userManager;

	public AuthManager(UserService userManager) {
		this.userManager = userManager;
	}

	@Override
	public void login(String mail, String password) {
		System.out.println("Ba�ar�yla giri� yap�ld�" + mail);

	}

	@Override
	public void register(User user) {
		if(BusinessRules.Run(userExists(user))&&ValidationRules.validate(UserValidator.rules(user)))
		{
			System.out.println("Ba�ar�yla kay�t olundu" + user.getName() + " " + user.getLastName());
			UserVerifyHelper.sendMail(user);
	
		}
		else
		{
			System.out.println("�ye zaten kay�t olmu� veya Validation kurallar� ge�ersiz");
		}
	}

	public boolean userExists(User user) {
		var result=this.userManager.getByMail(user);
		return (result==null)?true:false;
	}
}