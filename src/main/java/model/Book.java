package model;

public class Book {
private String title;
private String author;
private int year;
private int isbn;
private int price;

public Book() {
	super();
	this.title = null;
	this.year = 0;
	this.author = null;
	this.isbn = null;
	this.price = 0;

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
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}


}