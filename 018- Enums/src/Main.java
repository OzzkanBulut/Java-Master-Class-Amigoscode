import java.util.Arrays;

public class Main {


    enum Gender {
        MALE,
        FEMALE
    }

    enum TShirtSize {
        XS,
        S,
        M,
        L,
        XL
    }

    public static void main(String[] args) {
        System.out.println(Gender.FEMALE);
        System.out.println(TShirtSize.XL);

        System.out.println(Month.SEPTEMBER);
//        System.out.println(Gender.valueOf("FEMALEs")); --> Exception, No enum constant in Gender.FEMALE
        System.out.println(Arrays.toString(Gender.values())); // Prints all enum values

        for(Gender gender: Gender.values()){
            System.out.print(" "+gender);
        } // same as above, prints all enum values


    }
}