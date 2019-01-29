package com.projet3.webservice.Consumer.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.projet3.webservice.Model.beans.Role;

public class RoleRowMapper implements RowMapper<Role>{

	@Override
	public Role mapRow(ResultSet rs, int rowNum) throws SQLException {
		Role role = new Role();
		
		role.setId(rs.getInt("id_role"));
		role.setRoleName(rs.getString("role_name"));
		
		return role;
	}

}
