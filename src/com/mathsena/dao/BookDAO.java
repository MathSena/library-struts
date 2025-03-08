package com.mathsena.dao;

import java.util.ArrayList;
import java.util.List;

import com.mathsena.model.Book;

public class BookDAO {
	private static List<Book> books = new ArrayList<>();

	// Inicializa 10 livros com os atributos: id, title, author, category, image e
	// available
	static {
		books.add(new Book(1, "O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia", "images/senhor_dos_aneis.jpg", true));
		books.add(new Book(2, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Fantasia", "images/harry_potter.jpg",
				true));
		books.add(new Book(3, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Infantil",
				"images/pequeno_principe.jpg", true));
		books.add(new Book(4, "1984", "George Orwell", "Ficção Distópica", "images/1984.jpg", true));
		books.add(new Book(5, "A Revolução dos Bichos", "George Orwell", "Fábula Política",
				"images/revolucao_bichos.jpg", true));
		books.add(new Book(6, "Dom Quixote", "Miguel de Cervantes", "Clássico", "images/dom_quixote.jpg", true));
		books.add(new Book(7, "Crime e Castigo", "Fiódor Dostoiévski", "Romance", "images/crime_castigo.jpg", true));
		books.add(new Book(8, "O Hobbit", "J.R.R. Tolkien", "Fantasia", "images/hobbit.jpg", true));
		books.add(new Book(9, "A Arte da Guerra", "Sun Tzu", "Estratégia", "images/arte_guerra.jpg", true));
		books.add(new Book(10, "O Código Da Vinci", "Dan Brown", "Suspense", "images/codigo_vinci.jpg", true));
	}

	public List<Book> getBooks() {
		return books;
	}

	public Book getBookById(int id) {
		for (Book book : books) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}

	public void updateBook(Book book) {
		// Atualiza o livro na lista estática de livros
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getId() == book.getId()) {
				books.set(i, book);
				break;
			}
		}
	}
}
