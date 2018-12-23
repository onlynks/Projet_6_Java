package org.Consumer.DAO;

import java.sql.SQLException;

import org.beans.Book;

public interface BookDAO {
	public Book getBook(String title) throws SQLException;	

}
