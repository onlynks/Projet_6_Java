package com.projet3.library_webservice.library_webservice_business.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

	@Override
	public List<User> getUserList() throws SQLException {
		
		return userDAO.getUserList();
	}

	@Override
	public void createUser(User user) throws SQLException {
		userDAO.createUser(user);		
	}

}
