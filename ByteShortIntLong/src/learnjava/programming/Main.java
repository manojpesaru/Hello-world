package learnjava.programming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value: " + myMinIntValue);
        System.out.println("Integer Maximum value: " + myMaxIntValue);
        System.out.println("Busted MIN value: " +(myMinIntValue-1));
        System.out.println("Busted MAX value: " +(myMaxIntValue+1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value: " + myMinByteValue);
        System.out.println("Byte Maximum value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value: " + myMinShortValue);
        System.out.println("Short Maximum value: " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value: " + myMinLongValue);
        System.out.println("Long Maximum value: " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_263L;
        System.out.println(bigLongLiteralValue);

        byte myNewByteValue = (byte) (myMinByteValue / 2); //casting
        short myNewShortValue = (short) (myMinShortValue / 2); //casting

        byte newByte = 100;
        short newShort= 32000;
        int newInt = 100000;
        long newLong = 50000 + 10*(newByte+newShort+newInt);
        System.out.println(newLong);
        short shortValue = (short) (1000 + 10*(newByte+newShort+newInt)); //casting
        System.out.println(shortValue);

    }
}
