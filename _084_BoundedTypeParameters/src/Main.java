public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4};
        Double[] numbers2 = {1.0,2.0,3.0,4.0};
        System.out.println(compareNumbers(numbers,2));
        System.out.println(compareNumbers(numbers2,1.0));

    }

    static <T extends Comparable<T>> int compareNumbers(T[] numbers, T n){
        int count = 0;
        for(T number : numbers){
            if(number.compareTo(n) > 0){
                count++;
            }
        }
        return count;
    }
}