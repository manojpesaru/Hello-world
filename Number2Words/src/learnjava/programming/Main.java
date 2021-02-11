package learnjava.programming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        numberToWords(11);
        //System.out.println(reverse(11));
        System.out.println(getDigitCount(11));
        System.out.println(getDigitCount(reverse(11)));
    }

    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");
        else if(number==0){
            System.out.println("Zero");
        }
        else {
            int reversedNum=reverse(number);

            while(reversedNum>0){
                int digit=reversedNum%10;

                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid day");
                        break;
                }
                reversedNum=reversedNum/10;
            }
            int rNumber=reverse(number);
            int dCountRevNum = getDigitCount(rNumber);
            int dCountNumber = getDigitCount(number);
            if(dCountRevNum!=dCountNumber){
                for(int i=1; i<=dCountNumber-dCountRevNum;i++){
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse(int num) {
        if (num < 0) {
            int negNum = -num;
            int rev = 0;
            while (negNum > 0) {
                int digit = negNum % 10;
                rev = rev * 10;
                rev = rev + digit;
                negNum = negNum / 10;
            }
            return -rev;
        }
        else {
            int rev = 0;
            while (num > 0) {
                int digit=num%10;
                rev*=10;
                rev+=digit;
                num/=10;
            }
            return rev;
        }
    }

    public static int getDigitCount(int number){
        int count=0;
        if(number<0)
            return -1;


        else if(number==0){
             count++;
             return count;
        }
        else {

            while(number>0){
                number=number/10;
                count++;
            }
            return count;
        }
    }
}
