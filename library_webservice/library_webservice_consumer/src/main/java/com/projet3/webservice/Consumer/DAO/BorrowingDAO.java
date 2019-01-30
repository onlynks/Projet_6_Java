package com.projet3.webservice.Consumer.DAO;

import java.sql.SQLException;
import java.util.List;

import com.projet3.webservice.Model.beans.Book;
import com.projet3.webservice.Model.beans.Borrowing;
import com.projet3.webservice.Model.beans.User;

public interface BorrowingDAO {
	
	public Borrowing getBorrowingByBook(Book book) throws SQLException;
	
	public List<Borrowing> getBorrowingByUser(User user) throws SQLException;
	
	public void createBorrowing(Borrowing borrowing) throws SQLException;
	
	public void updateBorrowing(Borrowing borrowing) throws SQLException;
	
	public void deleteBorrowing(Borrowing borrowing) throws SQLException;

}
