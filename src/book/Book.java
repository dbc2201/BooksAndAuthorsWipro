package book;

import author.Author;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;

	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Name: " + name + "\n" + "Author: " + author.getName() + "\n" +
				"Price: " + price + "\n" + "Quantity in Stock: " + qtyInStock);
		return result.toString();
	}

}
