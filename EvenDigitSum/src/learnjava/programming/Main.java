package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getEvenDigitSum(123456));
    }
    public static int getEvenDigitSum(int number){
        if(number<0)
            return -1;
        else {
            int sum=0;
            while (number>0){
                int digit=number%10;
                if(digit%2==0){
                    sum+=digit;
                }
                number/=10;
            }
            return sum;
        }
    }
}
