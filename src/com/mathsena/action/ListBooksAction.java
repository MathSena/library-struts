package com.mathsena.action;

import java.util.List;

import com.mathsena.dao.BookDAO;
import com.mathsena.model.Book;
import com.opensymphony.xwork2.ActionSupport;

public class ListBooksAction extends ActionSupport {
	private List<Book> books;
	private BookDAO dao = new BookDAO();

	/**
	 * Método executado pelo Struts para listar os livros. Recupera a lista de
	 * livros do DAO e a disponibiliza para a view.
	 */
	public String execute() {
		books = dao.getBooks();
		return SUCCESS;
	}

	// Getter para a lista de livros, acessado pela JSP
	public List<Book> getBooks() {
		return books;
	}
}
