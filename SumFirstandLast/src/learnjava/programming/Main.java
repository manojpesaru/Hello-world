package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumFirstAndLastDigit(1236));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0)
            return -1;
        else{
            int reversedNum=reverse(number);
            int lastDigit=number%10;
            int firstDigit=reversedNum%10;
            return firstDigit+lastDigit;
        }
    }
    public static int reverse(int num){
        int rev = 0;
        while(num>0){
            int digit=num%10;
            rev*=10;
            rev+=digit;
            num/=10;
        }
        return rev;
    }
}
