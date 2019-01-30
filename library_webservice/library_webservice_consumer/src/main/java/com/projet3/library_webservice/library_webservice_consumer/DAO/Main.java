package com.projet3.library_webservice.library_webservice_consumer.DAO;

import java.sql.SQLException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projet3.library_webservice.library_webservice_model.beans.Borrowing;
import com.projet3.library_webservice.library_webservice_model.beans.Role;
import com.projet3.library_webservice.library_webservice_model.beans.User;


public class Main {

	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/consumerContext.xml");
		
		BookDAO bookDAO = (BookDAO) context.getBean("bookDAO");
		AuthorDAO authorDAO = (AuthorDAO) context.getBean("authorDAO");
		PublisherDAO publisherDAO = (PublisherDAO) context.getBean("publisherDAO");
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		BorrowingDAO borrrowingDAO = (BorrowingDAO) context.getBean("borrowingDAO");
		RoleDAO roleDAO = (RoleDAO) context.getBean("roleDAO");
		
		//role creation
		Role role = new Role();
		role.setRoleName("admin");		
		//roleDAO.createRole(role);
		
		//user creation
		User user = new User();
		user.setFirstName("Nicolas");
		user.setLastName("Garnier");
		user.setAdress("3 allée Miss Rodgers");
		user.setCity("Lardy");
		user.setPostCode(91510);
		user.setPhoneNumber("0637517428");
		user.setRole(roleDAO.getRole("admin"));
		user.setPassword("passwordTest");		
		//userDAO.createUser(user);
		
		//borrowing creation
		Borrowing borrowing = new Borrowing();
		LocalDate localDate = LocalDate.now();
		Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		System.out.print(LocalDate.now());
		
	}

}
