package com.projet3.library_webapp.library_webapp_consumer.DAO;

import java.util.List;

import com.projet3.library_webapp.library_webapp_model.book.Book;
import com.projet3.library_webapp.library_webapp_model.book.Borrowing;

public interface BookDAO {
	public Book getBook(int id);
	
	public List<Book> getBookList();
	
	public List<Book> bookResearch(String title);
	
	public List<Borrowing> getUserBorrowing(int UserId);
	
	public void extendBorrowing(int borrowingId);

}
