package com.projet3.webservice.Consumer.DAO;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/consumerContext.xml");
		
		BookDAOImpl dao = (BookDAOImpl) context.getBean("bookDAO");
		
		System.out.println(dao.getBookList());

	}

}
