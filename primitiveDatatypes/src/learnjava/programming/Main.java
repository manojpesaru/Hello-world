package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("My string is equal to " +myString);
        myString = myString + ", and this is more.";
        System.out.println("My string is equal to " +myString);
        myString = myString + " \u00A9 2019";
        System.out.println("My string is equal to " +myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
    }
}
