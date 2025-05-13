package hw6;

import java.util.Scanner;

//Add other classes here or separate java files in same package
//Method : main
public class Main {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        Library library = new Library();
	        
		// Add your Menu Here
	        //display menu options
	        while (true) {
	            System.out.println("\nLibrary Menu:");
	            System.out.println("1. Add Book");
	            System.out.println("2. Remove Book");
	            System.out.println("3. Display All Books");
	            System.out.println("4. Search by Title");
	            System.out.println("5. Search by Author");
	            System.out.println("6. Check Out Book");
	            System.out.println("7. Return Book");
	            System.out.println("8. Exit");
	            System.out.print("Choose an option: ");

	            //detecting user input
	            int choice;
	            if (scanner.hasNextInt()) {
	                choice = scanner.nextInt();
	                // detects user input
	                scanner.nextLine(); 
	            } else {
	                // detects invalid user input and shows menu again
	                scanner.nextLine(); 
	                continue;
	            }
		 
		  //1. add Book
	            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;
		   //2. remove Book
                case 2:
                    System.out.print("Enter ISBN to remove: ");
                    library.removeBook(scanner.nextLine());
                    break;
		   //3. display available book(s)
                case 3:
                    library.displayAllBooks();
                    break;
		   //4. search by title
                case 4:
                    System.out.print("Enter title to search: ");
                    library.searchByTitle(scanner.nextLine());
                    break;
		   //5. search by author
                case 5:
                    System.out.print("Enter author to search: ");
                    library.searchByAuthor(scanner.nextLine());
                    break;
		   //6. check out book
                case 6:
                    System.out.print("Enter ISBN to check out: ");
                    library.checkOutBook(scanner.nextLine());
                    break;
		   //7. return a book
                case 7:
                    System.out.print("Enter ISBN to return: ");
                    library.returnBook(scanner.nextLine());
                    break;
		   //8. exit
                case 8:
                    System.out.println("Exitting \n Thank you for using our service");
                    break;
                //display error message for invalid input
                default:
                    System.out.println("Invalid choice. Please select a valid choice.");
            }
        }
    }
}
