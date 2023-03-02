import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(17);
        myStack.push(21);
        myStack.push(32);
        myStack.push(42);
        myStack.push(23);

        System.out.println(myStack.peek()); // prints 23
        System.out.println(myStack.empty()); // false
        System.out.println(myStack.size()); // 5
        System.out.println(myStack.pop()); // deletes 23 and gives it to you
        System.out.println(myStack.size()); // 4
        System.out.println(myStack.push(33)); // adds 33 to top of the stack


//        for(Integer i : myStack){
//            System.out.println(i);
//        }

        /* Vector is synchronized. ArrayList is not synchronized. Thats the difference!

         */
    }
}