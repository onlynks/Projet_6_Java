package com.projet3.webservice.Consumer.DAO;

import java.sql.SQLException;
import com.projet3.webservice.Model.beans.Book;

public interface BookDAO {
	public Book getBook(String title) throws SQLException;	

}