package com.projet3.library_webservice.library_webservice_consumer.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.projet3.library_webservice.library_webservice_consumer.RowMapper.UserRowMapper;
import com.projet3.library_webservice.library_webservice_model.beans.User;

public class UserDAOImpl extends AbstractDAO implements UserDAO {
	
	@Autowired
	private RoleDAO roleDAO;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User getUserById(int id) throws SQLException {
		String sql = "SELECT * FROM user WHERE id_user = :id_user";
		SqlParameterSource namedParameters = new MapSqlParameterSource("id_user", id);
        
		User user = namedParameterTemplate.queryForObject(sql, namedParameters, new UserRowMapper(roleDAO));		
		return user;	
	}

	@Override
	public User logIn(String firstName, String lastName, String password) throws SQLException {
		String sql = "SELECT * FROM user WHERE first_name = :first_name AND last_name = :last_name";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("first_name", firstName);
		params.addValue("last_name", lastName);
        		
		User user = namedParameterTemplate.queryForObject(sql, params, new UserRowMapper(roleDAO));
		
		if(passwordEncoder.matches(password, user.getPassword())) {			
			return user;
		}else {
			return null;
		}
	}

	@Override
	public List<User> getUserList() throws SQLException {
		String sql = "SELECT * FROM user";
		List<User> userList = new ArrayList<User>();
		
		userList = template.query(sql, new UserRowMapper(roleDAO));
		return userList;
	}

	@Override
	public void createUser(User user) throws SQLException {
		String sql = "INSERT INTO user (first_name, last_name, adress, city, post_code, phone_number, id_role, password, email) VALUES (:first_name, :last_name, :adress, :city, :post_code, :phone_number, :id_role, :password, :email)";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("first_name", user.getFirstName());
		params.addValue("last_name", user.getLastName());
		params.addValue("adress", user.getAdress());
		params.addValue("city", user.getCity());
		params.addValue("post_code", user.getPostCode());
		params.addValue("phone_number", user.getPhoneNumber());
		params.addValue("id_role", user.getRole().getId());
		params.addValue("password", passwordEncoder.encode(user.getPassword()));
		params.addValue("email", user.getEmail());
		
		namedParameterTemplate.update(sql, params);		
		
	}

	@Override
	public void updateUser(User user) throws SQLException {
		String sql = "UPDATE user SET first_name = :first_name, last_name = :last_name, adress = :adress, city = :city, post_code = :post_code, phone_number = :phone_number, id_role = :id_role, password = :password, email = :email WHERE id_user = :id_user";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id_user", user.getId());
		params.addValue("first_name", user.getFirstName());
		params.addValue("last_name", user.getLastName());
		params.addValue("adress", user.getAdress());
		params.addValue("city", user.getCity());
		params.addValue("post_code", user.getPostCode());
		params.addValue("phone_number", user.getPhoneNumber());
		params.addValue("id_role", user.getRole().getId());
		params.addValue("password", passwordEncoder.encode(user.getPassword()));
		params.addValue("email", user.getEmail());
		
		namedParameterTemplate.update(sql, params);	
		
	}

	@Override
	public void deleteUser(User user) throws SQLException {
		String sql = "DELETE FROM user WHERE id_user = :id_user";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id_user", user.getId());
		
		namedParameterTemplate.update(sql, params);
		
	}

}
