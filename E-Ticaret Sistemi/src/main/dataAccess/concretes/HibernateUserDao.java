package main.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import main.dataAccess.abstracts.UserDao;
import main.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<User> users = new ArrayList<User>();

	@Override
	public void save(User user) {
		System.out.println("Hibernate ile eklendi: " + user.getFirstName());
		users.add(user);

	}

	@Override
	public void remove(User user) {
		// TODO Auto-generated method stub
		System.out.println("Hirnate ile silindi..");
		users.remove(user);

	}

	@Override
	public void removeById(String id) {
		// TODO Auto-generated method stub
		System.out.println("Silindi. ID: " + id);
		users.removeIf(user -> user.getId().equals(id));
		
	}

	@Override
	public User getUserById(String email) {
		for (User user : users) {
			if(user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {

		return users;
	}

}
