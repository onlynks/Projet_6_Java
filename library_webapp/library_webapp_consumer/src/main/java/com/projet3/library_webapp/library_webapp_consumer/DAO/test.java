package com.projet3.library_webapp.library_webapp_consumer.DAO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/consumerContext.xml");
		BookDAOImpl bookDAO = new BookDAOImpl();
		//System.out.println(context.getBean("bookDAO"));
		System.out.println(bookDAO.serviceConnection);

	}

}
