package learnjava.programming;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2:");
        int number2 = sc.nextInt();

        Operations op = new Operations(number1,number2);
        System.out.println("Sum of given numbers is: " +op.addition());
        System.out.println("Subtraction of given numbers is:"  +op.subtraction());
        System.out.println("Multiplication of given numbers is:"  +op.multiplication());
        System.out.println("Division of given numbers is:"  +op.div());
        System.out.println("new change");
    }
}
