package fligth_booking_system;

//Concrete class for Train Booking
public class TrainBooking implements Booking, ReservationManagement, PaymentHandling {
@Override
public void bookTicket() {
   System.out.println("Booking train ticket...");
}

@Override
public void makeReservation() {
   System.out.println("Making train reservation...");
}

@Override
public void cancelReservation() {
   System.out.println("Canceling train reservation...");
}

@Override
public void makePayment() {
   System.out.println("Processing train payment...");
}
}

