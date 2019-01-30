package com.projet3.library_webservice.library_webservice_consumer.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.projet3.library_webservice.library_webservice_consumer.DAO.RoleDAO;
import com.projet3.library_webservice.library_webservice_model.beans.User;

public class UserRowMapper implements RowMapper<User> {

	private RoleDAO roleDAO;
	
	public UserRowMapper(RoleDAO role) {
		roleDAO = role;
	}
	
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		
		user.setId(rs.getInt("id_user"));
		user.setFirstName(rs.getString("first_name"));
		user.setLastName(rs.getString("last_name"));
		user.setAdress(rs.getString("adress"));
		user.setCity(rs.getString("city"));
		user.setPostCode(rs.getInt("post_code"));
		user.setPhoneNumber(rs.getString("phone_number"));
		user.setRole(roleDAO.getRoleById(rs.getInt("id_role")));
		user.setPassword(rs.getString("password"));	
 
        return user;
	}

}
