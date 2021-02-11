package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("sum of digits:" +sumDigits(12345));
        System.out.println("sum of digits:" +sumDigits(-125));
        System.out.println("sum of digits:" +sumDigits(32123));
        System.out.println("sum of digits:" +sumDigits(777));

    }
    public static int sumDigits(int num){
        if(num<10){
            return -1;
        }
        int sum=0;
        while(num>0){
            int digit = num%10;
            sum+=digit;

            num=num/10;
        }
        return sum;
    }
}
