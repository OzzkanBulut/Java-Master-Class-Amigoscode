public class Example2 {
    public static void main(String[] args) {
        Comparable number = 10;
//        System.out.println(number.compareTo("10")); // throws ClassCastException. You cannot compare string with int
        Comparable<Integer> numberComparable = 10;
        System.out.println(numberComparable.compareTo(11));
    }
}
