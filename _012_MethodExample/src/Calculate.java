public class Calculate {
    public static double calculateRentalYield(double rentalIncome, double propertyPrice) {
        double result = ((rentalIncome * 12) / propertyPrice) * 100;
        return result;

    }
}
