package com.projet3.library_webservice.library_webservice_consumer.DAO;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.projet3.library_webservice.library_webservice_model.beans.Book;
import com.projet3.library_webservice.library_webservice_model.beans.Borrowing;
import com.projet3.library_webservice.library_webservice_model.beans.User;


public interface BorrowingDAO {
	
	public Borrowing getBorrowingByBook(Book book) throws SQLException;	
	public List<Borrowing> getBorrowingByUser(User user) throws SQLException;	
	public void createBorrowing(Borrowing borrowing) throws SQLException;	
	public void updateBorrowing(Borrowing borrowing) throws SQLException;	
	public void deleteBorrowing(Borrowing borrowing) throws SQLException;
	public List<Borrowing> getBorrowingsById(List<Integer> ids) throws SQLException;

}
