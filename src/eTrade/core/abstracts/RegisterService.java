package eTrade.core.abstracts;

import eTrade.entities.concretes.User;

public interface RegisterService {

	User register(String email,String password);
}
