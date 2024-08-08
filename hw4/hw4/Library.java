package hw4;

import java.util.HashMap;

public class Library {
    // Add the missing implementation to this class
    // Field:
    public static String operationHour = "daily from 9am to 5pm.";
    public String address;
    // public ArrayList<Book> bookCollections = new ArrayList<>();
    // public ArrayList<String> bookList = new ArrayList<>();
    private HashMap<String, Book> bookCollections = new HashMap<>();

    // Constructor:
    public Library(String address) {
        this.address = address;
    }

    // Methods:
    public void addBook(Book book) {
        if (!bookCollections.containsKey(book.title)) {
            bookCollections.put(book.title, book);
            // bookList.add(book.title);
            System.out.println("The book " + book.title + " is added to the library successfully!");
        } else {
            System.out.println("The book " + book.title + " is already exsisted in the library");
        }

        return;
    }

    public static void printOpeningHours() {
        System.out.println("Libraries are open " + operationHour);
    }

    public void printAddress() {
        System.out.println(this.address);
    }

    public void borrowBook(String bookName) {
        if (!bookCollections.containsKey(bookName)) {
            System.out.println("Sorry, this book is not in our catalog.");
            return;
        }

        if (!bookCollections.get(bookName).isBorrowed()) {
            bookCollections.get(bookName).rented();
            System.out.println("You successfully borrowed " + bookName);
        } else {
            System.out.println("Sorry, this book is already borrowed.");
        }

        return;
    }

    public void printAvailableBooks() {
        if (bookCollections.size() == 0) {
            System.out.println("No book in catalog.");
            return;
        }

        for (Book book : bookCollections.values()) {
            if (book.isBorrowed()) {
                continue;
            }
            System.out.println(book.title);
        }

        return;
    }

    public void returnBook(String bookName) {
        if (!bookCollections.containsKey(bookName)) {
            Book newBook = new Book(bookName);
            addBook(newBook);
            return;
        }

        if (bookCollections.get(bookName).isBorrowed()) {
            bookCollections.get(bookName).returned();
            System.out.println("You successfully returned " + bookName);
        } else {
            System.out.println("The book is already in the catalog.");
        }

        return;
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println();
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}