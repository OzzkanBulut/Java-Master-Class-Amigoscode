import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Person> map = new HashMap<>(); // most common one is HashMap
        map.put(1,new Person("Özkan"));
        map.put(2,new Person("Alex")); // Keys must be different!
        map.put(3,new Person("Alexa"));
        map.put(3,new Person("Alexa")); // this has no effect
        map.put(1,new Person("Özkan new")); // the last key number value is added

        System.out.println(map.size()); // get size
        System.out.println(map.get(1)); // get the index 1 element
        System.out.println(map.containsKey(4)); // does it have key 4 ?
        System.out.println(map.entrySet()); // gives the entries(values)
        System.out.println(map.keySet()); // gives the keys

        for( Map.Entry<Integer, Person> i : map.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }

//        System.out.println(map);

        map.remove(1);
        System.out.println(map.getOrDefault(4,new Person("Default"))); // get key 4. If not exist, get default

        System.out.println(map);

    }
}

record Person(String name){

}