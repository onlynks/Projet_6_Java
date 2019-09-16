package com.projet3.library_webapp.library_webapp_business.interfaces;

import com.projet3.library_webapp.library_webapp_model.user.User;

public interface UserManager {
	public User logIn(String firstName, String lastName, String password);
	public User getUserById(Integer userId);

}
