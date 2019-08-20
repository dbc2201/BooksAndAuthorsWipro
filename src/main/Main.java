package main;

import author.Author;
import book.Book;

public class Main {
	public static void main(String[] args) {
		Author author1 = new Author("John", "john@gmail.com", 'm');
		Book book1 = new Book("A Wonderful Story!", author1, 100.00, 40);
		System.out.println(book1);
	}
}
