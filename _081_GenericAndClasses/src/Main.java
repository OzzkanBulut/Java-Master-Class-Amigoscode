public class Main {
    public static void main(String[] args) {
    Box<Integer> box = new Box<>();
    box.setT(2);
//    box.setT("as"); --> Not work! Box class only accepts Integer

        Box box1 = new Box();
        box1.setT("1");
        box1.setT(12); // this is wrong. The type does not mean anything in here.


    }
}