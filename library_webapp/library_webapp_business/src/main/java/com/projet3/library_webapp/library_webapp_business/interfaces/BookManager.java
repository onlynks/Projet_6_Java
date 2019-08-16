package com.projet3.library_webapp.library_webapp_business.interfaces;

import java.util.List;
import java.util.Map;

import com.projet3.library_webapp.library_webapp_model.book.Book;
import com.projet3.library_webapp.library_webapp_model.book.Borrowing;
import com.projet3.library_webapp.library_webapp_model.user.User;

public interface BookManager {
	
	public Book getBook(int id);
	
	public Map<Book,Integer> getBookList();
	
	public Map<Book,Integer> bookResearch(String title);
	
	public Map<Borrowing,Map<String,String>> getUserBorrowing(User user);
	
	public void extendBorrowing(int borrowingId);
	
	public Map<User,List<Borrowing>> getLateBorrowing();
}


