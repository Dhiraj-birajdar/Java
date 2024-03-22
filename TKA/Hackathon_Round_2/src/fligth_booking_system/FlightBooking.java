package fligth_booking_system;

//Concrete class for Flight Booking
public class FlightBooking implements Booking, ReservationManagement, PaymentHandling {
@Override
public void bookTicket() {
   System.out.println("Booking flight ticket...");
}

@Override
public void makeReservation() {
   System.out.println("Making flight reservation...");
}

@Override
public void cancelReservation() {
   System.out.println("Canceling flight reservation...");
}

@Override
public void makePayment() {
   System.out.println("Processing flight payment...");
}
}
