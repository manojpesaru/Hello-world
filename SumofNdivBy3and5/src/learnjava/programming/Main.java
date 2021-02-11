package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum=0;
        int count=0;
        for(int i=1; i<=1000;i++){
            if((i%3==0)&&(i%5==0)){
                System.out.println(i);
                count++;
                sum=sum+i;
            }
            if(count==5){
                break;
            }
        }
        System.out.println(sum);
    }
}
