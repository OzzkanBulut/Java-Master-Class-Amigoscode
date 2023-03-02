public class Main {
    public static void main(String[] args) {
        String[] names = {"Ali","Mehmet"};
        Character[] chars = {'a','b','c'};
        Integer[] nums = {1,2,3,4,5};
        print(names);
        print(chars); // if the arrays are char and int it will not accept it . It must be a wrapper class for generic to work
        print(nums);
// Can not use int, double, char.. primitive types. It must be a object version of them to work with generics
        // i.e wrapper classes


    }

    static <T> void print(T[] array) {
        for (T s : array) {
            System.out.println(s.getClass().getName()
                    + "-"
                    + s
            );
        }
    }
}
