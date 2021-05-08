package main.business.abstracts;

import java.util.List;

import main.entities.concretes.User;

public interface UserService {

	void remove(User user);
	void login(String email, String password);
	void register(User user);
	List<User> getUsers();
	void deleteUserById(String email);
	User getUserById(String email);
}
