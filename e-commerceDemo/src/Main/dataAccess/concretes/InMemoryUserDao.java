package Main.dataAccess.concretes;

import Main.dataAccess.abstracts.UserDao;
import Main.entity.concretes.User;

public class InMemoryUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("�ye eklendi"+user.getName());
	}

	@Override
	public void delete(User user) {
		System.out.println("�ye silindi"+user.getName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("�ye g�ncellendi"+user.getName());
		
	}

	@Override
	public User get(User user) {
		return null;
	}

	@Override
	public User[] getAll() {
		return null;
	}


}
