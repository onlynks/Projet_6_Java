package com.projet3.webservice.Consumer.DAO;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projet3.webservice.Model.beans.Book;
import com.projet3.webservice.Model.beans.Publisher;

public class Main {

	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/consumerContext.xml");
		
		BookDAOImpl dao = (BookDAOImpl) context.getBean("bookDAO");
		
		Book book = new Book();
		book.setTitle("Les fleurs du mal");
		book.setDescription("Les Fleurs du mal est le titre d'un recueil de poèmes de Charles Baudelaire, englobant la quasi-totalité de sa production en vers, de 1840 jusqu'à sa mort survenue fin août 1867.");
		book.setQuantity(1);
		book.setMaxQuantity(1);
		/*
		dao.test();
		*/
		int result = dao.test(book);
		System.out.println(result);
	}

}
