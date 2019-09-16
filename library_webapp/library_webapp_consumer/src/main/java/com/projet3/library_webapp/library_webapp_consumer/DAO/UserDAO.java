package com.projet3.library_webapp.library_webapp_consumer.DAO;

import java.util.List;

import com.projet3.library_webapp.library_webapp_model.user.User;

public interface UserDAO {
	
	public User getUserById(Integer userId);
	
	public User logIn(String firstName, String lastName, String password);
	
	public List<User> getUserList();

}
