import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "red";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] = "yellow";
        System.out.println(colors[2]);

        int [] numbers ={1,2};
        System.out.println(numbers[0]);
        // Once you define the size, you can no longer change it!

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int i = colors.length-1; i >=0 ; i--) {
            System.out.println("Color "+(i+1)+": "+ colors[i]);
        }

        for(String color: colors){
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);

//        try{
//            System.out.println(colors[5]);
//        }catch(ArrayIndexOutOfBoundsException e){
//            throw new ArrayIndexOutOfBoundsException(":D");
//        }
    }
}
