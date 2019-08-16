package com.projet3.library_webapp.library_webapp_business.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projet3.library_webapp.library_webapp_business.interfaces.BookManager;
import com.projet3.library_webapp.library_webapp_consumer.DAO.BookDAO;
import com.projet3.library_webapp.library_webapp_consumer.DAO.UserDAO;
import com.projet3.library_webapp.library_webapp_model.book.Book;
import com.projet3.library_webapp.library_webapp_model.book.Borrowing;
import com.projet3.library_webapp.library_webapp_model.user.User;

public class BookManagerImpl implements BookManager
{
	@Autowired
	private BookDAO bookDAO;
	
	@Autowired
	private UserDAO userDAO;
	
	public Book getBook( int id ) {
    	Book book = bookDAO.getBook(id);
        
        return book;
    }
	
	public Map<Book,Integer> getBookList() {
	
		Map<Book,Integer> booksAndQuantities = this.getListQuantity(bookDAO.getBookList());
		return booksAndQuantities;
	}

	public Map<Book,Integer> bookResearch(String title) {
		List<Book> bookFound = bookDAO.bookResearch(title);		
		Map<Book,Integer> bookFoundQuantity = this.getListQuantity(bookFound);
		
		return bookFoundQuantity;
	}
	
	public Map<Borrowing,Map<String,String>> getUserBorrowing(User user) {
		List<Borrowing> borrowedBooks = bookDAO.getUserBorrowing(user.getId());
		Map<Borrowing,Map<String,String>> userBorrrowingswithDates = new HashMap<Borrowing,Map<String,String>>();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		for(int i=0;i<borrowedBooks.size();i++) {
;
			Map<String,String> borrowingDates = new HashMap<String,String>();
			
			String beginningDate = formatter.format(borrowedBooks.get(i).getBeginningDate().toGregorianCalendar().getTime());
			String endingDate = formatter.format(borrowedBooks.get(i).getEndingDate().toGregorianCalendar().getTime());			
			
			borrowingDates.put("Beginning", beginningDate);
			borrowingDates.put("Ending", endingDate);
			
			userBorrrowingswithDates.put(borrowedBooks.get(i), borrowingDates);			
		}
		
		return userBorrrowingswithDates;
	}
	
	public void extendBorrowing(int borrowingId) {
		bookDAO.extendBorrowing(borrowingId);
		
	}

	private Map<Book,Integer> getListQuantity(List<Book> bookList) {
		
		Map<Book, Integer> booksAndQuantities = new HashMap<Book, Integer>();
		
		Map<String, Integer> titleList = new HashMap<String,Integer>();
		
		for(int i=0; i<bookList.size(); i++)  {
			Boolean available = bookList.get(i).isAvailable();			
			
			if(titleList.containsKey(bookList.get(i).getTitle())) {		
				
				for(Entry<String, Integer> e : titleList.entrySet()) {
					if(available && e.getKey().equals(bookList.get(i).getTitle())) {
						e.setValue(e.getValue()+1);
					}					
			    }
			} else {
				titleList.put(bookList.get(i).getTitle(), available==true?1:0);
				booksAndQuantities.put(bookList.get(i), null);
			}
			
		}
		
		for(Entry<Book, Integer> e : booksAndQuantities.entrySet()) {
			e.setValue(titleList.get(e.getKey().getTitle()));				
	    }
		return booksAndQuantities;
		
	}

	public Map<User, List<Borrowing>> getLateBorrowing() {
		List<User> userList = userDAO.getUserList();
		
		Map<User, List<Borrowing>> userWithLateBorrowing = new HashMap<User, List<Borrowing>>();
		
		for(User user : userList){
			List<Borrowing> borrowingList = bookDAO.getUserBorrowing(user.getId());
			List<Borrowing> lateBorrowingList = new ArrayList<Borrowing>();
			
			for(Borrowing borrowing : borrowingList) {				
				
				XMLGregorianCalendar  gcDate = borrowing.getEndingDate();
				Date date = gcDate.toGregorianCalendar().getTime();
				
				if(date.before(new Date())) {
					lateBorrowingList.add(borrowing);					
				}
			}
			if(!lateBorrowingList.isEmpty()) {
				userWithLateBorrowing.put(user, lateBorrowingList);
			}			
		}	
		return userWithLateBorrowing;
	}

		
  
}
