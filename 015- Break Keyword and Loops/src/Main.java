public class Main {
    public static void main(String[] args) {
        // Break and Continue
        var numbers = new int[]{1,2,3,4,5,6,7,8,9,0};
        for(int number:numbers){
            System.out.println(number);
            if(number==3){
                break;
            }
        }
    }
}