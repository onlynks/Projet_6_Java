package com.projet3.library_webservice.library_webservice_consumer.DAO;

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
