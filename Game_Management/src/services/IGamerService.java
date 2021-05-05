package services;


import entities.User;

public interface IGamerService {

	void save(User user);
	void update(User user);
	void delete(User user);
}
