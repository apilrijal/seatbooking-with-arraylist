# 🎟️ Seat Booking Console Application (Java)

A Java console-based Seat Booking Application designed to manage seat reservations efficiently using core Java concepts.
The application allows users to book, cancel, update, and display seats through a menu-driven interface.

This project is ideal for demonstrating:

Java fundamentals

Object-Oriented Programming (OOP)

Collection framework (ArrayList)

Clean package structure

Real-world CRUD operations

## 🚀 Features

Book seats with validation to prevent duplicates

Cancel existing bookings

Update seat numbers

Display all active bookings with booking dates

Menu-driven console interface

Handles invalid input gracefully

## 🛠️ Technologies Used

Java (Core Java)

ArrayList

OOP Principles

Scanner (User Input)

Date API

Exception Handling

## 📁 Project Structure
src/
└── com/
    └── booking/
        ├── Main.java
        ├── controller/
        │   └── SeatBooking.java
        └── model/
            └── Seat.java

## 📌 Package Overview
com.booking

Contains the Main class

Entry point of the application

Handles menu navigation and user input

com.booking.controller

Contains SeatBooking

Business logic for:

Adding bookings

Cancelling bookings

Updating bookings

Displaying bookings

com.booking.model

Contains Seat

Represents the seat entity

Stores seat number, booking status, booking date, and cancellation status

## ▶️ How to Run the Application
Prerequisites

Java JDK 8 or higher

Command line or IDE (IntelliJ / Eclipse)

Steps

Clone the repository:

git clone https://github.com/your-username/seat-booking-app.git


Navigate to the src directory

Compile the application:

javac com/booking/Main.java


Run the program:

java com.booking.Main

## 📋 Menu Options
1. Add Booking
2. Cancel Booking
3. Update Booking
4. Display Bookings
5. Exit

## 🖥️ Sample Console Output
1. Add Booking
2. Cancel Booking
3. Update Booking
4. Display Bookings
5. Exit
Choose an option: 1

Enter a seat number to book:
A1
Seat A1 is booked successfully

Seat A1 was booked on Wed Dec 13 10:15:30 AEDT 2025

## 🧠 Key Concepts Demonstrated

Object-Oriented Programming (OOP)

Encapsulation using model classes

Use of ArrayList for dynamic storage

Separation of concerns using packages

Input validation and exception handling

CRUD operations in a console application

## 📷 Screenshots (Optional)

<img width="1397" height="479" alt="image" src="https://github.com/user-attachments/assets/f790e7fe-c689-4ab5-b933-2b374580bbf9" />

<img width="1135" height="545" alt="image" src="https://github.com/user-attachments/assets/a8525c5e-4cd1-4d09-bba7-b1908c5fd450" />



Example:

/screenshots/
 ├── add-booking.png
 ├── cancel-booking.png
 └── display-bookings.png

## 🔮 Future Enhancements

File persistence (save bookings to a file)

Search booking by seat number

Seat availability view

Role-based access (Admin / User)

Unit testing using JUnit

Migration to Spring Boot REST API

## 👤 Author

Aaron Rijal
Java Developer | Backend & Console Applications
📍 Australia

## 📜 License

This project is open-source and intended for learning and portfolio purposes.
