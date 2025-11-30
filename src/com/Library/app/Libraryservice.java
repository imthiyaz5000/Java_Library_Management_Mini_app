package Library.service;

import java.util.ArrayList;
import java.util.List;

import Library.model.Book;

public class Libraryservice {

	private List<Book> books = new ArrayList<>();

	public void addBook(Book b) {
		books.add(b);
	}

	// search book by title
	public Book searchByTitle(String title) {
		for (Book b : books) {
			if (b.getTitle().equalsIgnoreCase(title)) {
				return b;
			}
		}
		return null;
	}

	public void listBooks() {
		if (books.isEmpty()) {
			System.out.println("No books available.");
			return;
		}

		System.out.println("=== Available Books ===");
		for (Book b : books) {
			System.out.println(b);
		}
	}
}
