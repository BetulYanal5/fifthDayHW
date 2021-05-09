package eTrade.core.concrete;


import eTrade.core.abstracts.RegisterService;
import eTrade.entities.concretes.User;
import eTrade.google.GoogleManager;
import eTrade.google.UserForGoogle;

public class GoogleManagerAdapter implements RegisterService {

	@Override
	public User register(String email, String password) {
		GoogleManager googleManager=new GoogleManager();
		UserForGoogle userForGoogle=googleManager.register(email, password);
		
		
		return null;
	}

	

}
