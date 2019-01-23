package com.projet3.webservice.Consumer.DAO;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public abstract class AbstractDAO {
	
	@Autowired
	protected DataSource dataSource;
	
	@Autowired
	protected JdbcTemplate template;
	
	@Autowired
	protected NamedParameterJdbcTemplate namedParameterTemplate;
}
