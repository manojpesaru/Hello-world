package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isOdd(2));
        System.out.println(sumOdd(1,5));

    }
    public static boolean isOdd(int number){
        if(number<0)
            return false;
        else return number % 2 != 0;
    }

    public static int sumOdd(int start, int end){
        int sum=0;
        if(start<0 || end<0 || (end<start)){
            return -1;
        }
        else{
            for(int i=start;i<=end;i++){
                boolean x=isOdd(i);
                if(x)
                    sum+=i;
            }
        }
        return sum;
    }
}
