public class Main {
    public static void main(String[] args) {
        // Primitive Data Type Wrapper Classes
        // - byte -> Byte
        // - short -> Short
        // - int  -> Integer
        // - long -> Long
        // - float -> Float
        // - double -> Double
        // - boolean -> Boolean
        // - char -> Character

//        int age = 20; --> No methods for age
        Integer iAge = 20; // a lot of methods for iAge
        System.out.println(iAge.getClass());

        Double dPrice = 32.23;
        var ageStr = "55";
        int converted = Integer.parseInt(ageStr); // convert string to integer with the help of Integer class
        System.out.println(converted);
        System.out.println(Integer.max(220,22));

    }
}