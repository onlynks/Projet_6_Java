package org.Business.interfaces;

import java.sql.SQLException;

public interface BookManager {
	
	public String getBook(String title) throws SQLException;
}
