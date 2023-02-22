public class Main {
    public static void main(String[] args) {
        /*
            Your monthly rental income is : 1300
            Your annual rental income is : 1300 * 12 = 15_600
            You purchased the property for : 250_000
            Rental yield formula is : (Annual rental income / Property price) * 100
            Calculate the formula using methods
         */

        double monthlyRentalIncome = 1300;
        double propertyPrice = 250_000;
        System.out.println(Calculate.calculateRentalYield(monthlyRentalIncome,propertyPrice));

    }
}