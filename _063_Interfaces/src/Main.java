import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //This is polymorphism
        Vehicle scooter = new Scooter("scooterr","red",new BigDecimal(2000),"somthingscutır");
        Vehicle car = new Car("carr","red",new BigDecimal(20002),true);
        Vehicle bicycle = new Bicycle("bicyclee","red",new BigDecimal(100),"somthingbiciyc");


        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bicycle);
        vehicles.add(scooter);
        System.out.println(VehicleInterface.PURCHASE_RATE);; // interface fields are automatically static!

        for(Vehicle vehicle: vehicles){
            System.out.println(vehicle);
        }

        Person özkan = new Person("özkan",bicycle);
        System.out.println(özkan.getName()+"'s vehicle is : "+özkan.getVehicle().getName());
        // I can say vehicle to get all types of vehicles!

        car.defaultMethod();
        car.move();
        bicycle.move();




    }
}