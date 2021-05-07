package Main.dataAccess.abstracts;

import Main.entity.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	User get(User user);
	User[]getAll();
}
