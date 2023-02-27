package car;

import user.User;

import java.math.BigDecimal;

public class CarDAO {
    private static final Car[] cars;



    static {
        cars = new Car[5];
        cars[0] = new Car(2000,new BigDecimal(100_000),CarBrand.HYUNDAI);
        cars[1] = new Car(2013,new BigDecimal(200_000),CarBrand.FERRARI);
        cars[2] = new Car(2017,new BigDecimal(300_000),CarBrand.FORD);
        cars[3] = new Car(1999,new BigDecimal(420_000),CarBrand.TOYOTA);
        cars[4] = new Car(2022,new BigDecimal(4_020_000),CarBrand.TOFAS);
    }

    public CarDAO() {
    }

    public Car[] getCars() {
        return cars;
    }
    public Car getCar(int i){
        return cars[i];
    }
}
