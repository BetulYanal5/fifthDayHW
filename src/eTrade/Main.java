package eTrade;

import java.util.Scanner;

import eTrade.business.concretes.UserManager;

import eTrade.core.concrete.VerificationManager;
import eTrade.dataAccess.concretes.InMemoryUserDao;
import eTrade.entities.concretes.User;
import eTrade.google.GoogleManager;

public class Main {

	public static void main(String[] args) {
		

		String email= "betulyanal@gmail.com";
		UserManager userManager = new UserManager(new InMemoryUserDao());
		
		User user = new User(1,"Betül", "Yanal", "betulyanal@gmail.com", "12345654");

	

		Scanner scanner = new Scanner(System.in);
		int code= scanner.nextInt(); 
		
		VerificationManager verificationManager= new VerificationManager();
		verificationManager.checkVerificationCode(code);
		
	}
}
