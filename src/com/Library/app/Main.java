package Library.main;

import Library.model.Book;
import Library.service.Libraryservice;

public class Main {
	public static void main(String[] args) {

		Libraryservice service = new Libraryservice();

		service.addBook(new Book(1, "Rich Dad Poor Dad", "Robert Kiyosaki"));
		service.addBook(new Book(2, "Clean Code", "Robert Martin"));
		service.addBook(new Book(3, "Atomic Habits", "James Clear"));

		service.listBooks();

		System.out.println("\nSearching for: Clean Code");
		Book result = service.searchByTitle("Clean Code");

		if (result != null) {
			System.out.println("Found: " + result);
		} else {
			System.out.println("Book not found.");
		}
	}
}
