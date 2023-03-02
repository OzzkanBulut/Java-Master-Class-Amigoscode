import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // FIFO --> First In First Out
        Queue<Person> superMarket = new LinkedList<>(); // this is a good data structure for printer as well
        superMarket.add(new Person("özkan",24)); // First one to come out
        superMarket.add(new Person("Alex",21));
        superMarket.add(new Person("Mariam",17));

        System.out.println(superMarket.peek()); // özkan is at the front
        System.out.println(superMarket.size());
        System.out.println(superMarket.poll()); // removes the person at the front
        System.out.println(superMarket.size());
        System.out.println(superMarket.peek());

//        System.out.println(superMarket.offer(new Person("s",2))); --> This also adds to the queue.
//        But when there is a capacity restriction, this is more preferable.




    }
    static record Person(String name,int age){

    }
}