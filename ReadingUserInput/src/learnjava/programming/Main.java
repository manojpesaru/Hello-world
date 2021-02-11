package learnjava.programming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){

            int birthYear = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2021-birthYear;

            if(age>=0 && age<=100){
                System.out.println("Your name is: "+name+" and age is: "+age);
            }else {
                System.out.println("Invalid birth year");
            }
        }else {
            System.out.println("Unable to parse year of Birth");
        }

        scanner.close();
    }
}
