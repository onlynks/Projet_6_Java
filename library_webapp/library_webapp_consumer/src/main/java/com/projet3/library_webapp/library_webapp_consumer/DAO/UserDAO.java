package com.projet3.library_webapp.library_webapp_consumer.DAO;

import com.projet3.library_webapp.library_webapp_model.user.User;

public interface UserDAO {
	
	public User logIn(String firstName, String lastName, String password);

}
