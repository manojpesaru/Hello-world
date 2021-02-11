package learnjava.programming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        /*int min=0;
        int max=0;
        boolean first = true;
*/

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true){

            System.out.println("Enter number");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int number = scanner.nextInt();

                /*if(first){
                    first=false;
                    min=number;
                    max=number;
                }*/

                if(number>max){
                    max=number;
                }
                if(number<min){
                    min=number;
                }
            }
            else {
                System.out.println("min: "+min);
                System.out.println("max: "+max);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
