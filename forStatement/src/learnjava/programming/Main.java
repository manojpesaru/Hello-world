package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i=2;i<9;i++){
            System.out.println(String.format("%.2f",calculateInterest(10000.0,i)));
        }

        System.out.println("Reverse order");

        for (int i=8;i>1;i--){
            System.out.println(String.format("%.2f",calculateInterest(10000.0,i)));
        }

    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
