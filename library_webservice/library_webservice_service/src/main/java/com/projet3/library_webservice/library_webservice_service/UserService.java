package com.projet3.library_webservice.library_webservice_service;

import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.projet3.library_webservice.library_webservice_model.beans.User;

@WebService(serviceName="UserService")
public class UserService extends AbstractUserService{
	
	@WebMethod
	public User logIn(String firstName, String lastName, String password) {		
		User user = null;	
		
		try {
			user = userManager.logIn(firstName, lastName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
