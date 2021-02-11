public class LeapYearCalculator {
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
}
