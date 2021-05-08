package main.dataAccess.abstracts;

import java.util.List;

import main.entities.concretes.User;

public interface UserDao {
	void save(User user);
	void remove(User user);
	void removeById(String id);
	User getUserById(String id);
	List<User> getAll();
	
}
