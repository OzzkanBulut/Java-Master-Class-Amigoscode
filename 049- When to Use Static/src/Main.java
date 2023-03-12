public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(new Person().countNotStatic);
            // count is not static, therefore there will be 100 count created.
            // And counts are independent from eachother.Because of that all of the count values will be 1

            System.out.println(Person.countStatic);
            // This count is static. Therefore it's only created once.And any time we instantiate a person object,
            // the same count will increment.The static count value will be 100

            // STATIC IS MAINLY FOR PERFORMANCE

            // ASK YOURSELF, DOES IT MAKE SENSE TO CALL THIS METHOD EVEN IF NO OBJECT HAS BEEN CONSTRUCTED? IF YES,
            // THEN MAKE THAT METHOD STATIC !

        }
    }
}