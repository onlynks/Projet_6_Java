package com.projet3.library_webapp.library_webapp_consumer.DAO;

import com.projet3.library_webapp.library_webapp_model.user.UserService;

public class AbstractUserDAO {
	
	protected static UserService userServiceConnection;

	public static void setUserServiceConnection(UserService serviceConnection) {
		AbstractUserDAO.userServiceConnection = serviceConnection;
	}	

}
