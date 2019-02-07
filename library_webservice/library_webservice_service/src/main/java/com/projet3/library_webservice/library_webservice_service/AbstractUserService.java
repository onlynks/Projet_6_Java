package com.projet3.library_webservice.library_webservice_service;

import com.projet3.library_webservice.library_webservice_business.interfaces.UserManager;

public abstract class AbstractUserService {
	protected static UserManager userManager;

	public static void setUserManager(UserManager userManager) {
		AbstractUserService.userManager = userManager;
	}

}
