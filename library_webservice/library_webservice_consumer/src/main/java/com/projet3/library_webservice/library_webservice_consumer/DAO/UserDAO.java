package com.projet3.library_webservice.library_webservice_consumer.DAO;

import java.sql.SQLException;
import java.util.List;

import com.projet3.library_webservice.library_webservice_model.beans.User;

public interface UserDAO {
	public User getUserById(int id) throws SQLException;
	
	public User getUserByName(String firstName, String lastName) throws SQLException;
	
	public List<User> getUserList() throws SQLException;
	
	public void createUser(User user) throws SQLException;
	
	public void updateUser(User user) throws SQLException;
	
	public void deleteUser(User user) throws SQLException;

}
