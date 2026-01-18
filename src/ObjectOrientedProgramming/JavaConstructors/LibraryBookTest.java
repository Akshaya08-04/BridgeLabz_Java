package ObjectOrientedProgramming.JavaConstructors;
/*
Project Name: Library Book Management System
Problem Statement:
    Create a LibraryBook class with attributes title, author, price, and availability.
    Implement a method to borrow a book, which updates availability.

How the code works:
    1. LibraryBook class has attributes: title, author, price, available.
    2. Default constructor initializes attributes with default values and sets availability to true.
    3. Parameterized constructor initializes attributes with user-provided values and sets availability to true.
    4. borrowBook() method checks availability:
        - If available, marks the book as borrowed (available = false).
        - If not available, informs the user.
    5. display() method prints all book details including availability.
    6. Main class creates a LibraryBook object using parameterized constructor.
    7. Main class calls display() to show initial details.
    8. borrowBook() is called to borrow the book.
    9. display() is called again to show updated availability.
*/

class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    public LibraryBook() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
        available = true;
    }

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }
}

public class LibraryBookTest {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Java Basics", "Kanetkar", 350);
        System.out.println("Initial Book Details:");
        book.display();

        System.out.println("\nBorrowing the book:");
        book.borrowBook();

        System.out.println("\nAfter Borrowing:");
        book.display();
    }
}
