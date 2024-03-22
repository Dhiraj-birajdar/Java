package fligth_booking_system;

//Concrete class for Bus Booking
public class BusBooking implements Booking, ReservationManagement, PaymentHandling {
@Override
public void bookTicket() {
   System.out.println("Booking bus ticket...");
}

@Override
public void makeReservation() {
   System.out.println("Making bus reservation...");
}

@Override
public void cancelReservation() {
   System.out.println("Canceling bus reservation...");
}

@Override
public void makePayment() {
   System.out.println("Processing bus payment...");
}
}

