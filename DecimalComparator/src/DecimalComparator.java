public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2){
        n1=n1*1000;
        n2=n2*1000;
        double num1 = (int) n1;
        double num2 = (int) n2;
        return num1 == num2;
    }
}
