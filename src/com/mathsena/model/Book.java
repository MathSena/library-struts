package com.mathsena.model;

public class Book {
	private int id;
	private String title;
	private String author;
	private String category;
	private String image; // Ex.: "images/senhor_dos_aneis.jpg"
	private boolean available;

	public Book() {
	}

	public Book(int id, String title, String author, String category, String image, boolean available) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.category = category;
		this.image = image;
		this.available = available;
	}

	// Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
