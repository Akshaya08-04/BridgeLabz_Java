package ObjectOrientedProgramming.JavaConstructors;
/*
Project Name: Circle Area and Circumference Calculator
Problem Statement:
    Create a Circle class with a radius attribute.
    Use constructor chaining to initialize radius with default and user-provided values.
    Calculate and display the area and circumference of the circle.

How the code works:
    1. Circle class has one attribute: radius.
    2. Default constructor uses constructor chaining to call the parameterized constructor with a default value.
    3. Parameterized constructor initializes radius with the provided value.
    4. display() method calculates and prints area and circumference.
    5. Main class creates a Circle object using default constructor.
    6. Main class also creates a Circle object using user input.
    7. display() method is called for both objects.
*/

import java.util.Scanner;

class Circle {
    double radius;

    public Circle() {
        this(1.0); // Default radius using constructor chaining
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (3.14 * radius * radius));
        System.out.println("Circumference: " + (2 * 3.14 * radius));
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.display();

        System.out.print("\nEnter radius: ");
        double r = sc.nextDouble();
        Circle userCircle = new Circle(r);
        System.out.println("User-defined Circle:");
        userCircle.display();
    }
}
