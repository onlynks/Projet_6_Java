package org.Consumer;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class TestConnection {
	
	
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/projet_3";
		String username = "root";
		String password = "root";	
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Yep");
        } catch (ClassNotFoundException e) {
        	System.out.println("Nop");

        }
		
		Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM book WHERE book_title = 'Le petit cheval de manège'");	
		
		while ( resultSet.next() ) {

			System.out.println(resultSet.getString("book_description"));
		}
		
		
        
		  
	}		
	
	
	
	

}
