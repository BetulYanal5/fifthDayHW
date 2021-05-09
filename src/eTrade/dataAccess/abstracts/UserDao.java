package eTrade.dataAccess.abstracts;

import java.util.List;

import eTrade.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void update(User user);
	void delete(User user);
	List<User> getAll();
	User get(int id);
	User getByEmail(String email);
}
