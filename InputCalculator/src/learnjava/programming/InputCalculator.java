package learnjava.programming;

import java.util.Scanner;

public class InputCalculator {
        public static void inputThenPrintSumAndAverage(){
            Scanner scanner = new Scanner(System.in);
            int sum=0;
            double avg=0.0;
            int count=0;

            while (true){

                boolean hasNextInt = scanner.hasNextInt();

                if(hasNextInt){
                    int number = scanner.nextInt();
                    sum=sum+number;
                    count++;
                }
                else {
                    if(count!=0){
                        avg= (double) sum/count;
                    }
                    System.out.println("SUM = "+sum+" AVG = "+ Math.round(avg));
                    break;
                }
                scanner.nextLine();
            }
            scanner.close();
        }
    }

