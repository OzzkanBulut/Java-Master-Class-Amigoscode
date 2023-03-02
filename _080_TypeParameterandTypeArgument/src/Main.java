import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // List<E> -->E is the Type Parameter
        List<String> names = new ArrayList<>(); // String is the Type ARgument
//        names.add(1) --> Does not work. names only accepts String
        Map<String, String> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

/*
        Generic Type Naming Convention

        List<E> --> E stands for element
        Map<K,V> --> K stands for key, V stands for value
        N -> Stands for Number

        Helps us understand the code.
*/



    }
}