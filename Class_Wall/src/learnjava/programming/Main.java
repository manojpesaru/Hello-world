package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Wall wall = new Wall(5,4);
        System.out.println("area= " +wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("Width= "+wall.getWidth());
        System.out.println("Height= "+wall.getHeight());
        System.out.println("Area= "+wall.getArea());
    }
}
