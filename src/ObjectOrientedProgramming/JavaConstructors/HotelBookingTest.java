package ObjectOrientedProgramming.JavaConstructors;
/*
Project Name: Hotel Booking System
Problem Statement:
    Create a HotelBooking class to store information about hotel bookings including guest name, room type, and number of nights.
    Implement default, parameterized, and copy constructors to initialize bookings.

How the code works:
    1. HotelBooking class has attributes: guestName, roomType, and nights.
    2. Default constructor initializes attributes with default values.
    3. Parameterized constructor initializes attributes with user-provided values.
    4. Copy constructor creates a new HotelBooking object using values from an existing booking.
    5. display() method prints the booking details.
    6. Main class creates a default booking and displays it.
    7. Main class reads input from the user to create a parameterized booking and displays it.
    8. Copy constructor is used to create a copy of the parameterized booking and displays it.
*/

import java.util.Scanner;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

public class HotelBookingTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.display();

        System.out.print("\nEnter guest name: ");
        String name = sc.nextLine();
        System.out.print("Enter room type: ");
        String type = sc.nextLine();
        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();

        HotelBooking paramBooking = new HotelBooking(name, type, nights);
        System.out.println("\nParameterized Booking:");
        paramBooking.display();

        HotelBooking copyBooking = new HotelBooking(paramBooking);
        System.out.println("\nCopied Booking:");
        copyBooking.display();
    }
}
