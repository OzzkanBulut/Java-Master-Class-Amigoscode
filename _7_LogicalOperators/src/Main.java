public class Main {
    public static void main(String[] args) {
        String gender = "male";

        if(gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Male")){
            System.out.println("Valid Gender");
        }else{
            System.out.println("Invalid Gender");
        }
        System.out.println(true&&true); // true
        System.out.println(true&&false); // false
        System.out.println(true||false); // true
        System.out.println(true&&false&&true&&true&&true&&true); //false
        System.out.println(true&&false||true); // false

        boolean isAdult = false;
        if(isAdult){
            System.out.println("Not adult");
        }else {
            System.out.println("adult");
        }

    }
}