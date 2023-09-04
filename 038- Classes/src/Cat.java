public class Cat{ // cat class must be static in order to instantiate in a static method
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void meow(){
        System.out.println(name + ": meow...");
    }

}