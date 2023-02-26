package car;

public class CarDAO {
    private static Car[] cars;
    public static int nextAvailableSlot = 0;

    public static final int CAPACITY = 100;

    static{
        cars = new Car[CAPACITY];
    }
    public void saveCar(Car car) throws Exception {
        if(nextAvailableSlot+1 >=CAPACITY){
            throw new Exception("Capacity is reached!");
        }
        cars[nextAvailableSlot] = car;
        nextAvailableSlot++;

    }

    public Car[] selectAllCars() {
        return cars;
    }
}
