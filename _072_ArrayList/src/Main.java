import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors.size());
        System.out.println(colors.contains("blue"));
        System.out.println(colors.contains("pink"));
        for(String s:colors){
            System.out.println(s);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i)); //
        }

        List<Integer> numberList = List.of(1,2,3);
//        numberList.add(2); --> This doesnt work.
//        Because when you create a list using List.of method, the list is immutable!



    }
}