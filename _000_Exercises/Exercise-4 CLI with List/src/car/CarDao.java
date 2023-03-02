package car;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarDao {
    private static final List<Car> cars = Arrays.asList(
            new Car("123",new BigDecimal(100),Brand.BMW,false),
            new Car("456",new BigDecimal(300),Brand.TOFAS,true),
            new Car("456",new BigDecimal(500),Brand.MERCEDES,true)
    );

    public List<Car> getAllCars(){
        return cars;
    }

    public Car getCar(String regNumber) throws Exception {
        for(Car car: cars){
            if(car.getRegNumber().equals(regNumber)){
                return car;
            }else{
                throw new Exception("asd");
            }
        }
        return null;
    }
}
