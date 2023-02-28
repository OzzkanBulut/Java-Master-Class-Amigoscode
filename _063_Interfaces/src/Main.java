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


        for(Vehicle vehicle: vehicles){
            System.out.println(vehicle);
        }
    }
}