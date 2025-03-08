package com.mathsena.action;

import com.mathsena.dao.BookDAO;
import com.mathsena.model.Book;
import com.opensymphony.xwork2.ActionSupport;

public class BorrowBookAction extends ActionSupport {
	private int bookId;
	private Book book;
	private BookDAO dao = new BookDAO();

	/**
	 * Método para emprestar um livro. Verifica se o livro está disponível; se sim,
	 * atualiza seu status.
	 */
	public String execute() {
		book = dao.getBookById(bookId);
		if (book != null && book.isAvailable()) {
			book.setAvailable(false);
			dao.updateBook(book);
			addActionMessage("Livro emprestado com sucesso!");
		} else {
			addActionError("Livro não disponível ou não encontrado.");
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
