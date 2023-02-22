public class Foo {
    public static void main(String[] args) {
        String[] argss = {"1","a"};
        Main.main(argss);
        System.out.println("foo");
        System.out.println(Main.eeo); // eeo accessible because it's in the same package!

    }
}
