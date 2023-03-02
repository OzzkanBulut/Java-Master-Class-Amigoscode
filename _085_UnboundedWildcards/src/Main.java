import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    // ? Wildcards
    // Unbounded Wildcards
        List<Object> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        print(list1);
//        print(list2); --> Does not work.
//        print(list3); --> Does not work. Method needs Object Lists
        printBetter(list1);
        printBetter(list2);
        printBetter(list3); // all this works fine because we said in printBetter method that list can be any type





    }

    static void printBetter(List<?> list){ // This is unbounded wildcard. (No restrictions)
        list.forEach(System.out::println);
    }

    static void print(List<Object> list){
        list.forEach(System.out::println);
    }
}