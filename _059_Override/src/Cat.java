public class Cat extends Animal {
    private  String sound;

    public Cat(String name, int age) {
        super(name, age);
    }
    public Cat(String name, int age,String sound){
        super(name,age);
        this.sound = sound;
    }
    {
        this.sound = "meow";
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
