package com.bayamp.training.userdefined.objects;

public class Book {
	
	String title;
	String author;
	String publication;
	int totalPages;
	String category;
	
	public Book(String title, String author,String category) {
		this.title = title;
		this.author = author;		
		this.category = category;
	}
	public String getTitle() {
		return title;
	}

		public String getAuthor() {
		return author;
	}
	

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publication=" + publication + ", totalPages="
				+ totalPages + ", category=" + category + "]";
	}

	

}
