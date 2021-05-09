package eTrade.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	ArrayList<User> users=new ArrayList<User>();
	public InMemoryUserDao(){
		
			User user=new User(1,"Betül","Yanal","betulyanal1@gmail.com","123456");
			User user1=new User(2,"Selim","Ak","selimak@gmail.com","123456");
			User user2=new User(3,"Ayþe","Yýlmaz","ayseyilmaz@gmail.com","123456");
			users.add(user);
			users.add(user1);
			users.add(user2);
		
	}
	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("User is added : "+user.getFullName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Güncellendi");
		
	}

	@Override
	public void delete(User user) {
		this.users.remove(user.getId());
		System.out.println(user.getFullName()+" has been delted");		
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

	@Override
	public User get(int id) {
		User selectedUser=this.users.stream().filter((u)->u.getId()==id).findFirst().get();
		return selectedUser;
	}

	@Override
	public User getByEmail(String email) {
		User selectedEmail=this.users.stream().filter(u->u.getEmail()==email).findFirst().get();
		return selectedEmail;
	}

}
