package com.projet3.library_webapp.library_webapp_business.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.projet3.library_webapp.library_webapp_business.interfaces.UserManager;
import com.projet3.library_webapp.library_webapp_consumer.DAO.UserDAO;
import com.projet3.library_webapp.library_webapp_model.user.User;

public class UserManagerImpl implements UserManager{

	@Autowired
	private UserDAO userDAO;
	
	public User logIn(String firstName, String lastName, String password) {
		return userDAO.logIn(firstName, lastName, password);
	}

}
