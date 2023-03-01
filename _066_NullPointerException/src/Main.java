public class Main {
    public static void main(String[] args) {
        String brand = null; // brand reference does not point to anythin in heap!
//        System.out.println(brand.toUpperCase()); --> Throws NullPointerException.
        // NullPointerException is thrown when app tries to use null in a case where object is required

        System.out.println(brand.trim()); // this gives the exception too

        Cat rose = null; // rose reference does not point to anything in heap

        System.out.println(rose.toString()); // Gives nullpointereexception as well


    }

    static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

    }
}