package com.mathsena.action;

import com.mathsena.dao.BookDAO;
import com.mathsena.model.Book;
import com.opensymphony.xwork2.ActionSupport;

public class ReturnBookAction extends ActionSupport {
	private int bookId;
	private Book book;
	private BookDAO dao = new BookDAO();

	/**
	 * Método para devolver um livro. Verifica se o livro está emprestado; se sim,
	 * atualiza seu status para disponível.
	 */
	public String execute() {
		book = dao.getBookById(bookId);
		if (book != null && !book.isAvailable()) {
			book.setAvailable(true);
			dao.updateBook(book);
			addActionMessage("Livro devolvido com sucesso!");
		} else {
			addActionError("Livro não foi emprestado ou não encontrado.");
		}
		return SUCCESS;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Book getBook() {
		return book;
	}
}
