package com.projet3.library_webservice.library_webservice_service;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projet3.library_webservice.library_webservice_model.beans.User;

@WebService(serviceName="UserService")
public class UserService extends AbstractUserService{
	/*
	public static void main(String[] args) throws SQLException {
		  
		  ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		  
		  UserService userService = new UserService();
		  
		  System.out.print(userService.logIn("Nicolas", "Garnier", "passwordTest").getFirstName());
		  
	}
	*/
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
	
	@WebMethod
	public List<User> getUserList(){
		List<User> userList = null;
		
		try {
			userList = userManager.getUserList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}

}
