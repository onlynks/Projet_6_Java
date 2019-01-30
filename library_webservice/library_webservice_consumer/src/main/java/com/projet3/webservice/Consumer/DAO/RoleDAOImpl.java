package com.projet3.webservice.Consumer.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.projet3.webservice.Consumer.RowMapper.BookRowMapper;
import com.projet3.webservice.Consumer.RowMapper.RoleRowMapper;
import com.projet3.webservice.Model.beans.Book;
import com.projet3.webservice.Model.beans.Role;

public class RoleDAOImpl extends AbstractDAO implements RoleDAO{

	@Override
	public Role getRole(String roleName) throws SQLException {
		String sql = "SELECT * FROM role WHERE role_name = :role_name";
		SqlParameterSource namedParameters = new MapSqlParameterSource("role_name", roleName);
        
		Role role = namedParameterTemplate.queryForObject(sql, namedParameters, new RoleRowMapper());		
		return role;	
	}
	
	@Override
	public Role getRoleById(int id) throws SQLException {
		String sql = "SELECT * FROM role WHERE id_role = :id_role";
		SqlParameterSource namedParameters = new MapSqlParameterSource("id_role", id);
        
		Role role = namedParameterTemplate.queryForObject(sql, namedParameters, new RoleRowMapper());		
		return role;
	}

	@Override
	public List<Role> getRoleList() throws SQLException {
		String sql = "SELECT * FROM role";
		List<Role> roleList = new ArrayList<Role>();
		
		roleList = template.query(sql, new RoleRowMapper());
		return roleList;
	}

	@Override
	public void createRole(Role role) throws SQLException {
		String sql = "INSERT INTO role (id_role, role_name) VALUES (:id_role, :role_name)";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id_role", role.getId());
		params.addValue("role_name", role.getRoleName());
		
		namedParameterTemplate.update(sql, params);		
		
	}

	@Override
	public void updateRole(Role role) throws SQLException {
		String sql = "UPDATE role SET id_role = :id_role, role_name = :role_name";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id_role", role.getId());
		params.addValue("role_name", role.getRoleName());
		
		namedParameterTemplate.update(sql, params);	
		
	}

	@Override
	public void deleteRole(Role role) throws SQLException {
		String sql = "DELETE FROM role WHERE id_role = :id_role";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id_role", role.getId());
		
		namedParameterTemplate.update(sql, params);
		
	}	

}
