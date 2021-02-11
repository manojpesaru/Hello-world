package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(canPack(1,0,5));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if((bigCount<0)||(smallCount<0)||(goal<0)){
            return false;
        }
        int weight = (5 * bigCount) + (smallCount);
        if(weight<goal){
            return false;
        }
        else return goal % 5 <= smallCount;
    }
}
