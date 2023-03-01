import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String brand = null;
        Optional<String> brandOptional = Optional.ofNullable(brand);
        System.out.println(brandOptional.isEmpty()); // true because it's null
        if(brandOptional.isEmpty()){
            System.out.println("Brand is empty!");
        }else{
            System.out.println(brandOptional.get().toUpperCase());

        }
        brandOptional.ifPresentOrElse(b-> {
            System.out.println(b.toUpperCase());
        },() ->{
            System.out.println("Brand is empty");
        });
        var result = brandOptional.orElse("Amigoscode Foundation"); // if brandoptional is null, type amigoscode foundation
        System.out.println(result );

        printUppercase(Optional.of("foo"));


    }

    public static void printUppercase(Optional<String> s){
        s.ifPresent(something -> System.out.println(something.toUpperCase()) );
    }
}