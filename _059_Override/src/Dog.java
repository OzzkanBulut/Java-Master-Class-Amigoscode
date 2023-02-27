public class Dog extends Animal{
    private String sound;

    public Dog(String name, int age) {
        super(name, age);
    }
    public Dog(String name, int age,String sound){
        super(name,age);
        this.sound = sound;
    }
    {
        this.sound = "woof";
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println(sound);
    }

}
