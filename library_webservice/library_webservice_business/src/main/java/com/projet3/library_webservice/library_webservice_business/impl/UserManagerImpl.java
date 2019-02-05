package com.projet3.library_webservice.library_webservice_business.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.projet3.library_webservice.library_webservice_business.interfaces.UserManager;
import com.projet3.library_webservice.library_webservice_consumer.DAO.UserDAO;
import com.projet3.library_webservice.library_webservice_model.beans.User;

public class UserManagerImpl implements UserManager{
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public User logIn(String firstName, String lastName, String password) throws SQLException {
		
		return userDAO.logIn(firstName, lastName, password);
	}

}
