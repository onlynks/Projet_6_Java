package com.projet3.library_webapp.library_webapp_consumer.DAO;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projet3.library_webapp.library_webapp_model.book.Book;

public class test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/consumerContext.xml");
		
		BookDAO bookDAO = new BookDAOImpl();
		
		Map<Book, Integer> test = bookDAO.getBookList();
		
		for (Map.Entry<Book, Integer> entry : test.entrySet()) {
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	    }

	}

}
