package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int value=getDaysInMonth(2,2001);
        System.out.println(value);
    }
    public static boolean isLeapYear(int year){
        boolean leap=false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    leap=true;
                }
            }
            else{
                leap=true;
            }
        }
        if(year<=0 || year>9999){
            leap=false;
        }
        return leap;
    }

    public static int getDaysInMonth(int month, int year){
        if(year<1 || year>9999){
            return -1;
        }
        if(isLeapYear(year)){
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return 29;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return -1;
            }
        }
        else {
            switch (month) {
                case 1:
                case 3:
                case 12:
                case 10:
                case 7:
                case 8:
                case 5:
                    return 31;
                case 2:
                    return 28;
                case 4:
                case 11:
                case 6:
                case 9:
                    return 30;
                default:
                    return -1;
            }
        }
    }
}
