package ObjectOrientedProgramming.JavaConstructors;
/*
Project Name: Car Rental Management System
Problem Statement:
    Create a CarRental class with attributes customerName, carModel, rentalDays, and costPerDay.
    Initialize rental details using constructors and calculate total cost for the rental.

How the code works:
    1. CarRental class has attributes: customerName, carModel, rentalDays, costPerDay.
    2. Default constructor initializes attributes with default values.
    3. Parameterized constructor allows initializing with user-provided values.
    4. display() method prints all rental details and calculates total cost as rentalDays * costPerDay.
    5. Main class reads input from the user for all rental details.
    6. CarRental object is created using parameterized constructor.
    7. display() method is called to show rental information and total cost.
*/

import java.util.Scanner;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    public CarRental() {
        customerName = "Customer";
        carModel = "Sedan";
        rentalDays = 1;
        costPerDay = 1000;
    }

    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    public void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + (rentalDays * costPerDay));
    }
}

public class CarRentalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter car model: ");
        String model = sc.nextLine();
        System.out.print("Enter rental days: ");
        int days = sc.nextInt();
        System.out.print("Enter cost per day: ");
        double cost = sc.nextDouble();

        CarRental rental = new CarRental(name, model, days, cost);
        rental.display();
    }
}
