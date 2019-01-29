package com.projet3.webservice.Consumer.DAO;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projet3.webservice.Model.beans.Author;
import com.projet3.webservice.Model.beans.Book;
import com.projet3.webservice.Model.beans.Publisher;

public class Main {

	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/consumerContext.xml");
		
		BookDAO bookDAO = (BookDAO) context.getBean("bookDAO");
		AuthorDAO authorDAO = (AuthorDAO) context.getBean("authorDAO");
		PublisherDAO publisherDAO = (PublisherDAO) context.getBean("publisherDAO");
		
		Publisher publisher = publisherDAO.getPublisherByID(8);
		
		publisherDAO.deletePublisher(publisher);
		/*
		//Book update
		Book bookToUpdate = bookDAO.getBook("Harry Potter à l'école des sorciers");
		Author authorToInject = authorDAO.getAuthorByID(1);
		Publisher publisherToInject = publisherDAO.getPublisherByID(4);
		bookToUpdate.setAuthor(authorToInject);
		bookToUpdate.setPublisher(publisherToInject);
		bookDAO.updateBook(bookToUpdate);
		*/
		/*
		//Book creation
		Book book = new Book();
		book.setTitle("Harry Potter et la Coupe de feu");
		book.setDescription("Harry Potter et la Coupe de feu est le quatrième tome de la série littéraire centrée sur le personnage de Harry Potter créé par J. K. Rowling. Il a été publié le 29 novembre 2000 en France.");
		book.setQuantity(3);
		book.setMaxQuantity(3);
		book.setAuthor(authorDAO.getAuthorByID(1));
		book.setPublisher(publisherDAO.getPublisherByID(4));
		
		bookDAO.createBook(book);
		
		/*
		DateFormat dfl = DateFormat.getDateInstance(DateFormat.FULL);		
		Date date = dao.getAuthorByID(2).getBirthDate();
		System.out.println(dfl.format(date));
		*/
		
		
		//System.out.println(publisherDAO.getPublisherByID(4).getId());
		//System.out.println(authorDAO.getAuthorByID(1).getLastName());
		//System.out.println(publisherDAO.getPublisherByID(4).getName());
		
	}

}
