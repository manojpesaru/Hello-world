package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value: " + myMinFloatValue);
        System.out.println("Float maximum value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value: " + myMinDoubleValue);
        System.out.println("Double maximum value: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("My Int Value = " +myIntValue);
        System.out.println("My Float Value= " +myFloatValue);
        System.out.println("My Double Value= " +myDoubleValue);

        int num_of_pounds = 200;
        double num_of_kgs = num_of_pounds * 0.45359237;
        System.out.println(num_of_kgs);

    }
}
