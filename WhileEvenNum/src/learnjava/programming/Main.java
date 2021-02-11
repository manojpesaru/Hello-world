package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num = 4;
        int finishNum = 20;
        int count = 0;
        while(num<=finishNum){
            num++;
            if(!isEven(num)){
                count++;
                continue;
            }
            System.out.println("Even number: "+num);
            if(count==5){
                break;
            }
        }
    }

    public static boolean isEven(int n){
        if(n<0)
            return false;
        else{
            return n%2==0;
        }
    }
}
