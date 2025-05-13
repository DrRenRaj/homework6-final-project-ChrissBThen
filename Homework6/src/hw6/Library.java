package hw6;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    //method : adding new book
    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                System.out.println("Book with this ISBN already exists.");
                return;
            }
        }
        books.add(book);
        System.out.println("Book added.");
    }
    
    //method : remove a book
    public void removeBook(String isbn) {
        books.removeIf(b -> b.getIsbn().equals(isbn));
        System.out.println("Book removed.");
    }
    
    //method : displays available book
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books currently in library.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }

    //method : search book by title
    public void searchByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                System.out.println(b);
            }
        }
    }
    
    //method : search book by author
    public void searchByAuthor(String author) {
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(b);
            }
        }
    }

    //method : checks book out
    public void checkOutBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn) && b.isAvailable()) {
                b.setAvailable(false);
                System.out.println("Book checked out.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    //method : return a book
    public void returnBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                b.setAvailable(true);
                System.out.println("Book returned.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}