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

        // Arrays null values
        int[] array = new int[3];
        array[0] = 2;
        System.out.println(Arrays.toString(array)); // Default  value for int array is 0

        Arrays.fill(array,333); // fill the array with this value

        String[] strings = new String[3];
        strings[1] ="Özkan";
        System.out.println(Arrays.toString(strings)); // default  value for object array is null
        Arrays.fill(strings,"foo");
        System.out.println(Arrays.toString(strings));


    }
}