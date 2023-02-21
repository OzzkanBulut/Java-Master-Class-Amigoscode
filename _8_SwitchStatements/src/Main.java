public class Main {
    public static void main(String[] args) {
        // switch
        char grade = 'A';
        if (grade == 'A') {
            System.out.println("Excellent!");
        } else if (grade == 'B' || grade == 'C') {
            System.out.println("Pass");
        } else {
            System.out.println("Fail!".toUpperCase());
        }

        char sgrade = 'B';
        switch (sgrade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Pass");
                break;
            default:
                System.out.println("FAIL!");
        }

        // New Switch
        char ngrade = 'A';
        String result = switch (ngrade) {
            case 'A' -> "Excellent";
            case 'B', 'C' -> "Pass";
            default -> "Fail";
        };
        System.out.println(result);
    }

    ;

}