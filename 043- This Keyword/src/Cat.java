public class Cat {
    private String name;
    private int age;
    private String color;

    public Cat() {
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color; // this.color is the color in this class. color is the color we get from another place
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age; // You can also type this.age , but it's the same thing
    }

    public void setAge(int age) {
        this.age = age;
        age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color; // color of rose is : the color you give
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
