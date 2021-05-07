package Main.business.abstracts;

import Main.entity.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	void verify(User user,Boolean verified);
	User getByMail(User user);
}
