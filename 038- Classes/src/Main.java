public class Main {
    public static void main(String[] args) {
        Cat kitty = new Cat();
        kitty.setName("kitty");
        System.out.println(kitty.getName());
        

//        kitty.name --> not reachable because name is private


        Cat star = new Cat();
        star.setName("star");
        System.out.println( star.getName());

    }


}

