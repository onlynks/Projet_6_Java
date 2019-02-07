package com.projet3.library_webservice.library_webservice_consumer.DAO;

import java.sql.SQLException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projet3.library_webservice.library_webservice_model.beans.Book;
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
		BorrowingDAO borrowingDAO = (BorrowingDAO) context.getBean("borrowingDAO");
		RoleDAO roleDAO = (RoleDAO) context.getBean("roleDAO");
		
		//book creation
		Book book = new Book();
		book.setTitle("Harry Potter et le Prisonnier d'Azkaban");
		book.setDescription("Harry Potter et le Prisonnier d'Azkaban est le troisième roman de la série littéraire centrée sur le personnage de Harry Potter créé par J. K. Rowling. Il a été publié le 19 octobre 1999 en France.");
		book.setAuthor(authorDAO.getAuthorByID(1));
		book.setPublisher(publisherDAO.getPublisherByID(4));
		book.setAvailable(true);
		
		//bookDAO.createBook(book);
		
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
		
		
		LocalDate beginning = LocalDate.now();
		LocalDate ending = beginning.plusMonths(1);
		
		Date dateBeginnng = java.sql.Date.valueOf(beginning);
		Date dateEnding = java.sql.Date.valueOf(ending);
		
		//borrowing creation
		Borrowing borrowing = new Borrowing();
		borrowing.setBeginningDate(dateBeginnng);
		borrowing.setEndingDate(dateEnding);
		borrowing.setBook(bookDAO.getBookById(26));
		//borrowing.setUser(userDAO.logIn("Nicolas", "Garnier", "passwordTest"));
		//borrowingDAO.createBorrowing(borrowing);
		
		//borrowing update
		Borrowing borrowingToUpdate = borrowingDAO.getBorrowingByBook(bookDAO.getBookById(2));
		
		Date dateToUpdate = borrowingToUpdate.getEndingDate();
		
		Calendar myCal = Calendar.getInstance();
		myCal.setTime(dateToUpdate);    
		myCal.add(Calendar.MONTH, +1);    
		Date updatedDate = myCal.getTime();
		
		borrowingToUpdate.setEndingDate(updatedDate);
		//borrowingDAO.updateBorrowing(borrowingToUpdate);
		System.out.println(bookDAO.countBook("Harry Potter et le Prisonnier d'Azkaban"));
	}

}