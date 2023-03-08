package booking;

import car.Car;
import user.User;

public class BookingService {
    private BookingDAO bookingDAO;

    public BookingService(BookingDAO bookingDAO) {
        this.bookingDAO = bookingDAO;
    }

    public BookingService() {
    }

    public void makeBooking(User user, Car car) throws Exception {
        if(bookingDAO.getBookingCount()>bookingDAO.getBookings().length){
            throw new Exception("Bookings are full!");
        }
        for(Booking bookcheck : bookingDAO.getBookings()){
            if(bookcheck.getUser().getId() == user.getId()){
                throw new Exception("User is already registered!");
            }
        }
        if(!car.isAvailable()){
            throw new Exception("Car is not available!");
        }
        bookingDAO.makeBooking(user,car);
        car.setAvailable(false);
    }
    public Booking[] getBookings(){
        return bookingDAO.getBookings();
    }
}
