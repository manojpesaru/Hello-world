package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSameLastDigit(32,23,43));
        System.out.println(isValid(100));
    }
    public static boolean hasSameLastDigit(int n1, int n2, int n3){
        if((n1<10 || n1>1000) || (n2<10 || n2>1000) || (n3<10 || n3>1000)){
            return false;
        }
        else {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            int d3 = n3 % 10;
            return ((d1==d2)||(d2==d3)||(d3==d1));
        }
    }
    public static boolean isValid(int num){
        return num >= 10 && num <= 1000;
    }
}
