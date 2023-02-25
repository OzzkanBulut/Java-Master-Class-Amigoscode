public class Person {
    public int countNotStatic = 0;
    public static int countStatic = 0 ;
    /*  Because the count variable is not static and belongs to the instance,
        everytime we create a Person instance, the count variable will be created in the memory too.
        Let's say we create 100 person instance, the count will be created 100 times.
        That takes a lot of memory!
        If the count were to be static, then it would not belong to the instance, it would belong to the Class itself.
        When it belongs to the class, it will be created only once.
        No more memory problem!
    */
    public Person() {
        countNotStatic++;
        countStatic++;
    }
}
