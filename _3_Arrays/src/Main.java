import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Arrays
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(Arrays.toString(numbers));
        System.out.println("Length of array: "+numbers.length);

        int[] numbers2 = {2,3,4,5,6,7,2};
        for(int number:numbers2){
            System.out.print(number+ " ");
        }
        System.out.println("\nLength of second array: "+numbers2.length);

        String[] names = {"Özkan","Ali","Mehmet"};
        System.out.println("Names array: "+ Arrays.toString(names));
    }
}