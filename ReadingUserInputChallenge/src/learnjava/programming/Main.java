package learnjava.programming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int sum=0;
        int counter = 0;

        while (true){
            int order = counter+1;
            System.out.println("Enter number #"+order);
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int number = scanner.nextInt();
                sum=sum+number;
                counter++;
                if(counter==10){
                    break;
                }
            }
            else {
                System.out.println("Enter valid number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println(sum);
        scanner.close();
    }
}
