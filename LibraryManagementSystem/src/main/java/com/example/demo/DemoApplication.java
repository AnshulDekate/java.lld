package com.example.demo;

import com.example.demo.models.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Library library = new Library("Bangalore", 5);
		Librarian librarian = new Librarian("admin", library);

		Book b1 = new Book("1", "SystemDesign", "John", "JackPublications");
		Book b2 = new Book("2", "OODesign", "John", "JackPublications");

		BookItem bi1 = new BookItem(b1, "1");
		BookItem bi2 = new BookItem(b1, "2");
		BookItem bi3 = new BookItem(b1, "3");

		BookItem bi4 = new BookItem(b2, "4");
		BookItem bi5 = new BookItem(b2, "5");

		librarian.addBookItem(bi1);
		librarian.addBookItem(bi2);
		librarian.addBookItem(bi3);
		librarian.addBookItem(bi4);
		librarian.addBookItem(bi5);

		System.out.println(library);

		User u1 = new User(1, "u1");

		Search search = new Search(library);

		ArrayList<BookItem> searchedBooks = search.byAuthor.get("John");

		BookItem borrowedBook = null;
		for (BookItem bookItem: searchedBooks){
			if (!bookItem.borrowed){
				borrowedBook = bookItem;
				u1.borrowBook(bookItem);
				break;
			}
		}

		System.out.println(library);
		System.out.println(u1);

		u1.returnBook(borrowedBook);

		System.out.println(library);
		System.out.println(u1);
	}

}
