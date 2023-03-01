public class Cube implements ThreeDShape {
    private final int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return length*length*3-1+5; // random calculation. not important
    }

    @Override
    public double volume() {
        return length*length*length;
    }
}
