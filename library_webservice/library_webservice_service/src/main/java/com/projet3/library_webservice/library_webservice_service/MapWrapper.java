package com.projet3.library_webservice.library_webservice_service;

import java.util.Map;

import com.projet3.library_webservice.library_webservice_model.beans.Book;

public class MapWrapper {

    protected Map<Book,Integer> bookMap;

	public Map<Book,Integer> getBookMap() {
		return bookMap;
	}

	public void setBookMap(Map<Book,Integer> bookMap) {
		this.bookMap = bookMap;
	}
}