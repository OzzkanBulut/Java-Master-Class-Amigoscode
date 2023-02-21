public class Main {
    public static void main(String[] args) {
        // Pass by value
        int age = 21;
        int ageCopy = age; // value of age is copied to ageCopy
        System.out.println(age);
        System.out.println(ageCopy);
        ageCopy = 22;
        System.out.println(ageCopy);
        System.out.println(age); // age is not affected by the change of ageCopy
        ageCopy = increment(age);
        System.out.println(ageCopy); // 22
        System.out.println(age); // Again , age will not change

    }
    static int increment(int age){
        return ++age;
    }
}