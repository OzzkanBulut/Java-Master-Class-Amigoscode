public class Main {

    // Protected
    // Protected fields are accessible only to class itself as well as it's subclasses
    // We can reach programmer.name in the programmer class if the name attribute is protected
    // if it's private, we can not access!
    public static void main(String[] args) {
        String[] languages = new String[]{"C#","Java"};
        Programmer özkan = new Programmer("özkan",24,languages);
        özkan.writeSomeCode();

        Manager manager = new Manager("ahmet",42,3);
        manager.report();

    }
}