package eTrade.business.abstracts;

import java.util.List;

import eTrade.entities.concretes.User;

public interface UserService {

	void add(User user);
	void update(User user);
	void delete(User user);
	List<User> getAll();
	User get(int id);
	User getByEmail(String email);
	
}
