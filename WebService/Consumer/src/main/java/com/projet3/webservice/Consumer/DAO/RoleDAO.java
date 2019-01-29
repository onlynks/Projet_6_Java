package com.projet3.webservice.Consumer.DAO;

import java.sql.SQLException;
import java.util.List;
import com.projet3.webservice.Model.beans.Role;

public interface RoleDAO {
	public Role getRoleById(int id) throws SQLException;
	
	public Role getRole(String roleName) throws SQLException;
	
	public List<Role> getRoleList() throws SQLException;
	
	public void createRole(Role role) throws SQLException;
	
	public void updateRole(Role role) throws SQLException;
	
	public void deleteRole(Role role) throws SQLException;
}
