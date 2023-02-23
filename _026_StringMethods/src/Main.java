public class Main {
    public static void main(String[] args) {
        String number = String.valueOf(1);
        System.out.println(number);

        String format = String.format("Number %s : ", number); // like in C
        System.out.println(format);

        System.out.println("Number " + number); // Number 1

        String[] names = {"Özkan","Ali","Mehmet"};
        String united = String.join("|",names);
        System.out.println(united);
    }
}