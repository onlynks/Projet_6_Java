package com.projet3.library_webservice.library_webservice_business.interfaces;

import java.sql.SQLException;

import com.projet3.library_webservice.library_webservice_model.beans.User;

public interface UserManager {
	
	public User logIn(String firstName, String lastName, String password) throws SQLException;
}
