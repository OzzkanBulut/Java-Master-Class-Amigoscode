import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Person özkan = new Person("Özkan",
                "Bulut",
                "ozkanb66@gmail.com",
                "05446800169",
                new House("100", BigDecimal.valueOf(12500),4),
                new Car(CarBrand.TOFAS,2000,"Red",BigDecimal.valueOf(200000)),
                new Address("Çığ Sokak","Ankara","Turkey",06));
        System.out.println(özkan);



    }
}