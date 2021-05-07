package Main.business.concretes;

import Main.business.abstracts.UserService;
import Main.core.utils.helpers.UserVerifyHelper;
import Main.dataAccess.abstracts.UserDao;
import Main.entity.concretes.User;

public class UserManager implements UserService {
	private UserDao userdao;

	public UserManager(UserDao userdao) {
		this.userdao = userdao;
	}
	@Override
	public void add(User user) {
		
			this.userdao.add(user);
		}	

	@Override
	public void delete(User user) {
		this.userdao.delete(user);	
		
	}

	@Override
	public void update(User user) {
		this.userdao.update(user);	
		
	}
	
	@Override
	public void verify(User user, Boolean verified) {
		UserVerifyHelper.verify(user,verified);
	}

	
	
	//Business Rules
	public User getByMail(User user) {
		if(user.getMail()=="caglasahin@gmail.com")
		{
			return user;
		}
		else
		{
			return null;
		}
	}



}
