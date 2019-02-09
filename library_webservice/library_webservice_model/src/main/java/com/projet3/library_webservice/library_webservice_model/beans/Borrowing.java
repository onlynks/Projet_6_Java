package com.projet3.library_webservice.library_webservice_model.beans;

import java.util.Date;

public class Borrowing {
	private int id;
	private Date beginningDate;
	private Date endingDate;
	private Book book;
	private User user;
	private boolean extended;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getBeginningDate() {
		return beginningDate;
	}
	public void setBeginningDate(Date beginningDate) {
		this.beginningDate = beginningDate;
	}
	public Date getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Boolean getExtended() {
		return extended;
	}
	public void setExtended(Boolean extended) {
		this.extended = extended;
	}
	

}
