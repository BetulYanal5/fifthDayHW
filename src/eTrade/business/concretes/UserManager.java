package eTrade.business.concretes;

import java.util.List;
import java.util.regex.Pattern;





import eTrade.business.abstracts.UserService;
import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	public UserManager(UserDao userDao) {
		this.userDao=userDao;
	}
	@Override
	public void add(User user) {   
	    if(CheckIfEmailValid(user.getEmail()) && CheckIfEmailExists(user.getEmail())) {
	    	if(CheclIfPasswordValid(user.getPassword())) {
	    		if(CheckIfNameLengthValid(user.getFirstName(),user.getLastName())) {
	    			this.userDao.add(user);
	    			System.out.println("Ýþlem baþarýlý , kullanýcý eklendi");    			
	    		}else {
	    			System.out.println("Ýsim ve soyisim en az 2 karakter olmalýdýr");
				}
	    	}
	    		else {
					System.out.println("Þifre en az 6 karakterden oluþmalýdýr");
				}
	    }else{
	    	System.out.println("E-posta adresi geçersiz");	
	    }	
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}

	@Override
	public User get(int id) {
		return this.userDao.get(id);
	}

	@Override
	public User getByEmail(String email) {
		return this.userDao.getByEmail(email);
	}

	public boolean CheckIfEmailValid(String email) {
		boolean result=false;
		Pattern pattern=Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
	    java.util.regex.Matcher matcher=pattern.matcher(email);
		if(matcher.matches()) {
			result=true;
		}
		return result;
	}
	
	public boolean CheckIfEmailExists(String email) {
		boolean result=false;
		if(this.userDao.getByEmail(email)==null) {
			result = true;
		}
		return result;
	}
	
	public boolean CheclIfPasswordValid(String password) {
		boolean result=false;
		if(password.length()>=6) {
			result=true;
		}
		return result;
	}
	
	public boolean CheckIfNameLengthValid(String firstName,String lastName) {
		boolean result=false;
		if((lastName.length()>= 2) && (firstName.length() >= 2)){
			result=true;
		}
		return result; 
	}
}
