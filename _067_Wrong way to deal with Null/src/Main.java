public class Main {
    public static void main(String[] args) {
        String brand = null;

        try{
            System.out.println(brand.toUpperCase());
        }catch(NullPointerException e){
            throw new NullPointerException("brand is null!");
        }finally{
            System.out.println("bye!");
        }

    }
}