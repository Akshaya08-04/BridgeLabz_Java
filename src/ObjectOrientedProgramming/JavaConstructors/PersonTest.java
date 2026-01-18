package ObjectOrientedProgramming.JavaConstructors;
/*
Project Name: Person Copy Constructor Example
Problem Statement:
    Create a Person class with attributes name and age.
    Implement a copy constructor to clone another person's attributes.

How the code works:
    1. Person class has attributes: name and age.
    2. Default constructor initializes attributes with default values.
    3. Parameterized constructor initializes attributes with provided values.
    4. Copy constructor creates a new Person object with the same values as another Person object.
    5. display() method prints the Person details.
    6. Main class creates a parameterized Person object.
    7. Copy constructor is used to create a clone of the first object.
    8. display() method shows original and copied object details.
*/

import java.util.Scanner;

class Person {
    String name;
    int age;

    public Person() {
        name = "Unknown";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String n = sc.nextLine();
        System.out.print("Enter age: ");
        int a = sc.nextInt();

        Person original = new Person(n, a);
        Person copy = new Person(original);

        System.out.println("\nOriginal Person:");
        original.display();

        System.out.println("\nCopied Person:");
        copy.display();
    }
}
