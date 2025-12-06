package com.booking.controller;
import com.booking.model.Seat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SeatBooking {
    // List to store bookings
    private List<Seat> bookedSeatsList;
    // Constructor
    public SeatBooking() {
        // Initialize the list of booked seats
        // TODO 1 : this.bookedSeatsList = ?
        this.bookedSeatsList = new ArrayList<>();


        // Creating new object!

    }
    // Method to add a new seat booking
    public void addNewBooking(String seatNumber) {
        // TODO 2: check if the seat is already booked and not canceled
        for(Seat seat : bookedSeatsList){
            if(seat.getSeatNumber().equalsIgnoreCase(seatNumber)) {
                if (seat.isBooked() && !seat.isCanceled()) {
                    System.out.println("Seat " + seatNumber + " is already booked");
                    return;
                }
            }
        }

        // TODO 3 create a new Seat object for the booking,
        // mark the seat as booked,
        // set the current date as the booking date
        Seat newSeat = new Seat(seatNumber);

        // TODO 4: add the new seat to the bookedSeatsList

        bookedSeatsList.add(newSeat);

        // TODO 5: confirm the booking to the user
        System.out.println("Seat: " + newSeat + " is  booked");
    }


    // Method to cancel a booking
    public void cancelBooking(String seatNumber) {
        // TODO 6: iterate through the list of booked seats
        boolean found = false;
        for (Seat seat : bookedSeatsList) {
            if (seat.getSeatNumber().equalsIgnoreCase(seatNumber)) {
                found = true;
                // TODO 7: check if the seat number matches and is not already canceled
                // mark the seat as canceled
                // mark the seat as not booked
                // confirm the cancellation to the user


                if (seat.isCanceled()) {
                    System.out.println("Seat " + seat.getSeatNumber() + " is already canceled");
                    return;
                }
                seat.setCanceled(true);
                seat.setBooked(false);

                System.out.println("Seat " + seat.getSeatNumber() + " is cancelled");
            }
        }
        // TODO 8: inform the user if no booking was found for the seat number
        if (!found) {
            System.out.println("No booking is found for seat number: " + seatNumber + ", please try again");
        }
    }


    // Method to update a booking seat number
    public void updateBooking(String oldSeatNumber, String newSeatNumber) {
        // TODO 9: iterate through the list of booked seats
        for(Seat seat : bookedSeatsList){
            // TODO 10: check if the seat number matches the old seat number and is not canceled
            // TODO 11: update the seat number to the new seat number
            if(seat.getSeatNumber().equalsIgnoreCase(oldSeatNumber) && !seat.isBooked()){
                seat.setSeatNumber(newSeatNumber);

                System.out.println("Seat " + newSeatNumber + " is updated, your old seat number was: " + oldSeatNumber);
                return;
            }
        }




        // confirm the update to the user
        // TODO 12: inform the user if no booking was found for the old seat number

        System.out.println("No active booking found for the seat number: " + oldSeatNumber + ", please try again");
    }
    // Method to display all bookings
    public void displayBookings() {
        // TODO 13: check if the bookedSeatsList is empty, inform the user that no bookings have been made yet
        if(bookedSeatsList.isEmpty()){
            System.out.println("No booking is found for the service");
        }
        // TODO 14: iterate through the list of booked seats, Check if the seat is booked and not canceled
        // TODO 15: display the seat number and booking date
        for(Seat seat : bookedSeatsList){
            if(seat.isBooked() && !seat.isCanceled()){
                System.out.println("Seat " + seat.getSeatNumber() + " was booked on " + seat.getBookingDate());
            }
        }



    }



}
