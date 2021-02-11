package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSharedDigit(12,33));
    }
    public static boolean hasSharedDigit(int n1, int n2){
        if((n1<10 || n1>99) || (n2<10 || n2>99)){
            return false;
        }
        else {
            int d12 = n1 % 10;
            int d11 = n1 / 10;

            int d22 = n2 % 10;
            int d21 = n2 / 10;

            return ((d11 == d21) || (d11 == d22)) || ((d12 == d21) || (d12 == d22));
        }
    }
}
