package com.projet3.library_webapp.library_webapp_app;

import com.projet3.library_webapp.library_webapp_business.interfaces.UserManager;

public class AbstractUserController {
	
	protected static UserManager userManager;
	
	public static void setUserManager(UserManager userManager) {
		AbstractUserController.userManager = userManager;
	}

}
