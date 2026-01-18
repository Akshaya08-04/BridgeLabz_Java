package ObjectOrientedProgramming.JavaConstructors;
/*
Project Name: Book Management System
Problem Statement:
    Create a Book class to store information about a book including title, author, and price.
    Implement both default and parameterized constructors to initialize the book objects.

How the code works:
    1. The Book class has three attributes: title, author, price.
    2. Default constructor initializes the attributes with default values.
    3. Parameterized constructor allows creating Book objects with user-provided values.
    4. The display() method prints all the book details to the console.
    5. In the main class, Scanner is used to take input from the user for parameterized book creation.
    6. Two Book objects are created: one using default constructor and one using parameterized constructor.
    7. The display method is called for both objects to show the details.
*/

import java.util.Scanner;

class Book {
    // Book class stores book information
    String title;   // Book title
    String author;  // Book author
    double price;   // Book price

    public Book() {
        // Default constructor
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    public Book(String title, String author, double price) {
        // Parameterized constructor
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        // Method to display book details
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookTest {
    // Main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book Details:");
        defaultBook.display();

        // Using parameterized constructor
        System.out.print("\nEnter book title: ");
        String t = sc.nextLine();
        System.out.print("Enter author name: ");
        String a = sc.nextLine();
        System.out.print("Enter price: ");
        double p = sc.nextDouble();

        Book paramBook = new Book(t, a, p);
        System.out.println("\nParameterized Book Details:");
        paramBook.display();
    }
}
