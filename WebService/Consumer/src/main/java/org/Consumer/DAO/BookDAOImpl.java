package org.Consumer.DAO;

import org.beans.Book;
import java.sql.*;

public class BookDAOImpl implements BookDAO{
	
	public DAOFactory DAOFactory;
	
	public BookDAOImpl(DAOFactory Factory) {
		this.DAOFactory = Factory;
	}

	@Override
	public Book getBook(String title) throws SQLException {
		
		Connection connection = DAOFactory.getConnection();
		Statement statement = connection.createStatement();		
		
		ResultSet resultSet = statement.executeQuery("SELECT * FROM book WHERE book_title = '"+title+"'");
		
		int id = 0;
		String description = null;
		
		while(resultSet.next()) {
			 id = resultSet.getInt("book_id");
			 description = resultSet.getString("book_description");				
		}	
		Book book = new Book(id, title, description);
			
		return book;
	}

}
