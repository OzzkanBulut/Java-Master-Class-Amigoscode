package booking;

import car.Car;
import user.User;

public class BookingDAO {

    private Booking[] bookings;
    private int bookingCount;
    {
        bookings = new Booking[50];
        bookingCount = 0;
    }

    public BookingDAO() {
    }

    public BookingDAO(Booking[] bookings, int bookingCount) {
        this.bookings = bookings;
        this.bookingCount = bookingCount;
    }


    public Booking[] getBookings() {
        return bookings;
    }

    public void setBookings(Booking[] bookings) {
        this.bookings = bookings;
    }

    public int getBookingCount() {
        return bookingCount;
    }

    public void setBookingCount(int bookingCount) {
        this.bookingCount = bookingCount;
    }

    public void makeBooking(User user, Car car){
        bookings[bookingCount++] = new Booking(user,car);
    }
}
