import booking.BookingDAO;
import booking.BookingService;
import car.Car;
import car.CarDAO;
import car.CarService;
import user.User;
import user.UserDAO;
import user.UserService;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        UserService userService = new UserService(new UserDAO());
        BookingService bookingService = new BookingService(new BookingDAO());
        CarService carService = new CarService(new CarDAO());
        User user = new User(1,"Özkan");
        User user1 = new User(2,"Ahmet");
        int userid = 3;
        int input = 9 ;
        while(input!=7) {
            System.out.println(
                    "1- Book Car\n" +
                            "2- View All User Booked Cars\n" +
                            "3- View All Bookings\n" +
                            "4- View Available Cars\n" +
                            "5- Add user\n" +
                            "6- View all users\n" +
                            "7- Exit ");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    bookingService.makeBooking(user,carService.getCar(0));
                    break;
                case 2:
                    System.out.println(Arrays.toString(userService.getUsers()));
                    break;
                case 3:
                    System.out.println("All bookings:");
                    System.out.println(Arrays.toString(bookingService.getBookings()));;
                case 4:
                    System.out.println("available cars:");
                    for(Car car:carService.getCars()){
                        if(car.isAvailable()){
                            System.out.print(car+" ");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Enter name:");

                    String name = scan.nextLine();
                    scan.next();
                    new User(userid++,name);
                    System.out.println("User "+name+" is created");
                    break;
                case 6:
                    System.out.println("All users:");
                    System.out.println(Arrays.toString(userService.getUsers()));
                    break;
                case 7:
                    return;

            }
        }

    }
}