package learnjava.programming;
import java.util.Scanner;    // using scanner class from util package (available in Java API)
// Java API is a library of pre-written classes
// related classes are grouped together to form packages

class Main {
    private int x=5; // private variables/attributes of a class are accessible only within the class
    private int y=7; // They can't be accessed by other classes

    public void setX(int x) { // since variables are private, we use setters to set new values to them
        this.x = x;           // here setX and setY
    }

    public void setY(int y) {
        this.y = y;
    }

    public int addition(){      // class method - here addition()
        return x+y;
    }

    public static void main(String[] args) {        // main method
        Main m = new Main();                        // main class object creation
        m.setX(10);                                 // setting new value to class variable
        m.setY(15);                                 // setting new value to class variable
        System.out.println("sum of 2 nums: " +m.addition());

        Scanner sc = new Scanner(System.in);        //Scanner class object creation
        System.out.println("Enter num1");
        int a = sc.nextInt();                       //accessing int input from user
        System.out.println("Enter num2");
        int b = sc.nextInt();                       //accessing int input from user
        int c = a+b;
        System.out.println("sum of given numbers: " +c);
    }
}
