package com.projet3.webapp.Consumer.DAO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projet3.webapp.Model.BookService_Service;

public class test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/consumerContext.xml");
		BookDAOImpl bookDAO = new BookDAOImpl();
		//System.out.println(context.getBean("bookDAO"));
		System.out.println(bookDAO.serviceConnection);

	}

}
