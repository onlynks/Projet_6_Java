package com.projet3.webservice.Consumer.DAO;


import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projet3.webservice.Model.beans.Book;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/consumerContext.xml");	
		
		BookDAOImpl test = (BookDAOImpl) context.getBean("bookDAO");
		
		Book book = test.getBook("Tintin");
		((ConfigurableApplicationContext)context).close();
		
		System.out.println(book.getDescription());


	}
	
}
