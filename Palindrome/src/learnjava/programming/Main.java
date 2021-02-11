package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPalindrome(-1221));
    }
    public static boolean isPalindrome(int num){
        int reverse=0;
        int startNum = num;
        if(num<0){
            num=-(num);
            startNum=num;
        }
        while (num>0){
            int digit= num%10;
            reverse*=10;
            reverse=reverse+digit;
            num/=10;
        }
        return startNum == reverse;
    }
}
