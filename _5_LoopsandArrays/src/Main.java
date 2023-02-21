public class Main {
    public static void main(String[] args) {
        String[] names = {
                "Özkan",
                "Mahmut",
                "Hakkı",
                "Mehmet",
                "Ali",
                "Ömer"
        };

        for (int i = 0; i < names.length; i++) { // This for loop is used when you want to access the index !
            System.out.println(names[i]);
        }

        for (String s : names) { // In this enhanced for loop, you can not access the index !
            System.out.println(s);
        }
    }
}