package com.projet3.library_webservice.library_webservice_consumer.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.projet3.library_webservice.library_webservice_consumer.RowMapper.BorrowingRowMapper;
import com.projet3.library_webservice.library_webservice_model.beans.Book;
import com.projet3.library_webservice.library_webservice_model.beans.Borrowing;
import com.projet3.library_webservice.library_webservice_model.beans.User;

public class BorrowingDAOImpl extends AbstractDAO implements BorrowingDAO {

	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private BookDAO bookDAO;
	
	@Override
	public Borrowing getBorrowingByBook(Book book) throws SQLException {
		String sql = "SELECT * FROM borrowing WHERE book_id = :book_id";
		SqlParameterSource namedParameters = new MapSqlParameterSource("book_id", book.getId());
        
		Borrowing borrowing = namedParameterTemplate.queryForObject(sql, namedParameters, new BorrowingRowMapper(userDAO, bookDAO));		
		return borrowing;
	}

	@Override
	public List<Borrowing> getBorrowingByUser(User user) throws SQLException {
		String sql = "SELECT * FROM user WHERE id_user = :id_user";
		List<Borrowing> borrowingList = new ArrayList<Borrowing>();
		
		borrowingList = template.query(sql, new BorrowingRowMapper(userDAO, bookDAO));
		return borrowingList;
	}

	@Override
	public void createBorrowing(Borrowing borrowing) throws SQLException {
		String sql = "INSERT INTO borrowing (beginning_date, ending_date, book_id, id_user) VALUES (:beginning_date, :ending_date, :book_id, :id_user)";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("beginning_date", borrowing.getBeginningDate());
		params.addValue("ending_date", borrowing.getEndingDate());
		params.addValue("book_id", borrowing.getBook().getId());
		params.addValue("id_user", borrowing.getUser().getId());
		
		namedParameterTemplate.update(sql, params);		
	}

	@Override
	public void updateBorrowing(Borrowing borrowing) throws SQLException {
		String sql = "UPDATE borrowing SET beginning_date = :beginning_date, ending_date = :ending_date, book_id = :book_id, id_user = :id_user WHERE borrowing_id = :borrowing_id";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("borrowing_id", borrowing.getId());
		params.addValue("beginning_date", borrowing.getBeginningDate());
		params.addValue("ending_date", borrowing.getEndingDate());
		params.addValue("book_id", borrowing.getBook().getId());
		params.addValue("id_user", borrowing.getUser().getId());
		
		namedParameterTemplate.update(sql, params);		
	}

	@Override
	public void deleteBorrowing(Borrowing borrowing) throws SQLException {
		String sql = "DELETE FROM borrowing WHERE borrowing_id = :borrowing_id";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("borrowing_id", borrowing.getId());
		
		namedParameterTemplate.update(sql, params);
		
	}


}
