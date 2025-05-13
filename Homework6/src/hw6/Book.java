package hw6;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    // getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }

    // setters
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
    	//displays book info
        return String.format("Title: %s | Author: %s  \nISBN: %s  \nAvailable: %b" 
        		, title, author, isbn, isAvailable ? "Yes" : "No");
    }
}
