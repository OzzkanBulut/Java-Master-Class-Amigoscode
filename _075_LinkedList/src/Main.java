import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Özkan",23));
        linkedList.add(new Person("Namık",34));
        linkedList.add(new Person("Michael",12));
        linkedList.addFirst(new Person("First Person",1));
//        linkedList.forEach(System.out::println);
        ListIterator<Person> personListIterator = linkedList.listIterator();

        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next()); // print through the linkedlist
        }
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous()); // print linkedlist backwards
        }
        // Using linkedLists are very costly.You store data, the next reference and the previous reference.
        // Basically, you triple the data you store!

    }



    private static void queues(){
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Özkan",23));
        queue.add(new Person("Mehmet",32));
        queue.add(new Person("Ali",74));

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }
}

 record Person(String name, int age){

}