package com.projet3.library_webapp.library_webapp_consumer.DAO;

import com.projet3.library_webapp.library_webapp_model.user.User;

public class UserDAOImpl extends AbstractUserDAO implements UserDAO{

	public User logIn(String firstName, String lastName, String password) {
		
		return userServiceConnection.logIn(firstName, lastName, password);
	}

}
