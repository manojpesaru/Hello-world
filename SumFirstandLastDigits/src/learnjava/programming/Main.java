package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumFirstAndLastDigit(0));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0)
            return -1;

        else{
            int lastDigit=number%10;
            int firstDigit=0;
            while (number>0){
                int digit = number%10;
                number=number/10;
                firstDigit=digit;
            }
            return firstDigit+lastDigit;
        }
    }
}
