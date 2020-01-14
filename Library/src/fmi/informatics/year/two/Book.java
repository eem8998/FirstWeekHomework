package fmi.informatics.year.two;

public class Book {
	
	private String bookTitle;
	private String bookAuthor;
	private String bookPublisher;
	private int bookYear;
	private String bookISBN;
	
	public String bookInfo() {
		return String.format("Book: \"%s\" by %s.\nPublisher: \"%s\", Year: %d, ISBN: %s\n",				//1ви Custom метод за String
				bookTitle, bookAuthor, bookPublisher, bookYear, bookISBN);
	}
	public String bookSearched() {
		return String.format("%s released \"%s\" in %s. It was published by \"%s\" and it's ISBN is: %s", 	//2ри Custom метод за String
				bookAuthor, bookTitle,bookYear ,bookPublisher , bookISBN);
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	
	public int getBookYear() {
		return bookYear;
	}
	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}
	
	public String getBookISBN() {
		return bookISBN;
	}
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
	



}
