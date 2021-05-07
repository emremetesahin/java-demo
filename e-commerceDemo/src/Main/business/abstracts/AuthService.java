package Main.business.abstracts;

import Main.entity.concretes.User;

public interface AuthService {
	void login(String mail,String password);
	void register(User user);
}
