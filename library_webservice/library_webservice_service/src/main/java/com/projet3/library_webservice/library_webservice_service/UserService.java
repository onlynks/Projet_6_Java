package com.projet3.library_webservice.library_webservice_service;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.projet3.library_webservice.library_webservice_consumer.DAO.UserDAO;
import com.projet3.library_webservice.library_webservice_consumer.DAO.UserDAOImpl;
import com.projet3.library_webservice.library_webservice_model.beans.Role;
import com.projet3.library_webservice.library_webservice_model.beans.User;

@WebService(serviceName="UserService")
public class UserService extends AbstractUserService{
	 /*
	public static void main(String[] args) throws SQLException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		  
		  UserService userService = new UserService();
		  //PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		  
		  Role role = new Role();
		  role.setId(1);
		  
		  User user = new User();
		  user.setFirstName("Francois");
		  user.setLastName("Pignon");
		  user.setPassword("mdp");
		  user.setAdress("18 rue de la caravane");
		  user.setCity("Saint-Germain");
		  user.setPostCode(91750);
		  user.setPhoneNumber("0685786363");
		  user.setEmail("fpignon@gmail.com");
		  user.setRole(role);		  
		  
		  userService.createUser(user);
		  //System.out.println(userService.getUserById(2));		  
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
	
	@WebMethod
	public void createUser(User user) {
		try {
			userManager.createUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
