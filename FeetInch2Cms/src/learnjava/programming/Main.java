package learnjava.programming;

public class Main {

    public static void main(String[] args) {
        double value = calcFeetAndInchesToCentimeters(6,10);
        if(value<0.0){
            System.out.println("Invalid parameters");
        }
        System.out.println(value);

        double cms = calcFeetAndInchesToCentimeters(100);
        System.out.println(cms);
    }
    public static double calcFeetAndInchesToCentimeters(int feats, int inches){
        if((feats<0) || ((inches<0) || (inches>12))){
            return -1;
        }
            return ((30.48*feats)+(2.54*inches));
    }
    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            return -1;
        }
        int feats = inches/12;
        int remainingInches = inches%12;
        return calcFeetAndInchesToCentimeters(feats,remainingInches);
    }
}
