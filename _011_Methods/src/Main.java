public class Main {
    /*
    A method needs:
        - Access Modifier
        - Optional Static
        - Return Type
        - Name
        - Optional Parameters
        - Method Body
        - Optional return values

     */
    public static void main(String[] args) {
        // body
        System.out.println(addNumbers(3,5));

        // Parameters --> Values a method take when it's created
        // Arguments --> Values a method take when it's called!
        printBrand();
        toUpperCase("ahmet");
    }

    private static int addNumbers(int num1, int num2){
        return num1+num2;
    }
    private static void printBrand(){
        System.out.println("Amigoscode");
    }
    private static void toUpperCase(String s){
        System.out.println(s.toUpperCase());
    }
}