public class Main {
    public static void main(String[] args) {
        //Continue
        var names = new String[]{
                "Andre",
                "Jamila",
                "Ali",
                "Jones",
                "Matt"
        };

        for(String name : names){
            if(name.startsWith("A")){
                continue;
            }
            System.out.println(name);
        }
    }
}