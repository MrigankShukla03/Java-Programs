public class Box {
    private double length;
    private double width;
    private double height;

    // Constructor with no arguments
    public Box() {
        length = 0;
        width = 0;
        height = 0;
    }

    // Constructor with one argument
    public Box(double side) {
        length = side;
        width = side;
        height = side;
    }

    // Constructor with three arguments
    public Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    // Method to calculate the volume of the box
    public double getVolume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        // Create a box with no arguments
        Box box1 = new Box();
        System.out.println("Volume of Box1 is: " + box1.getVolume());

        // Create a box with one argument
        Box box2 = new Box(5);
        System.out.println("Volume of Box2 is: " + box2.getVolume());

        // Create a box with three arguments
        Box box3 = new Box(2, 3, 4);
        System.out.println("Volume of Box3 is: " + box3.getVolume());
    }
}