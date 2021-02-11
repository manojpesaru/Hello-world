package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("Rect.width: "+rectangle.getWidth());
        System.out.println("Rect.length: "+rectangle.getLength());
        System.out.println("Rect.Area: "+rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("Cuboid.width: "+cuboid.getWidth());
        System.out.println("Cuboid.length: "+cuboid.getLength());
        System.out.println("Cuboid.Area: "+cuboid.getArea());
        System.out.println("Cuboid.height: "+cuboid.getHeight());
        System.out.println("Cuboid.volume: "+cuboid.getVolume());
    }
}
