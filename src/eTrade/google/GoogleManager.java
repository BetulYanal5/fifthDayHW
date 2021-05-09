package eTrade.google;

import java.util.ArrayList;
import java.util.List;

public class GoogleManager {

	static List<UserForGoogle> userForGoogle;
	public GoogleManager() {
		userForGoogle=new ArrayList<UserForGoogle>();
		userForGoogle.add(new UserForGoogle(5,"Betül","Yanal","betulyanal@gmail.com","123456"));
	}
	
	public UserForGoogle register(String email, String password) {
		UserForGoogle user=null;
		for(UserForGoogle item:userForGoogle) {
			if(item.getEmail().equals(email) && item.getPassword().equals(password));
			{
				user=item;
				break;
				
			}
		}
		return user;
	}
}
