package fligth_booking_system;

public class Main {
 public static void main(String[] args) {
     // Test Flight Booking
     Booking flightBooking = new FlightBooking();
     flightBooking.bookTicket();
     ((ReservationManagement) flightBooking).makeReservation();
     ((PaymentHandling) flightBooking).makePayment();

     // Test Train Booking
     Booking trainBooking = new TrainBooking();
     trainBooking.bookTicket();
     ((ReservationManagement) trainBooking).cancelReservation();
     ((PaymentHandling) trainBooking).makePayment();

     // Test Bus Booking
     Booking busBooking = new BusBooking();
     busBooking.bookTicket();
     ((PaymentHandling) busBooking).makePayment();
 }
}

//Problem 3: Flight Booking System
//• Create an abstraction for a flight or train or bus booking system with 
//some operations.
//• Define interfaces for
//o booking,
//o managing reservations, and 
//o handling payments.
//• Implement concrete classes for different types of booking and 
//reservation management