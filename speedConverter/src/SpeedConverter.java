public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour<0){
            return -1;
        }
        double calculatedValue =  kilometersPerHour/1.609;
        return Math.round(calculatedValue);
    }
    public static void printConversion(double kilometersPerHour){
        double calculatedValue = kilometersPerHour/1.609;
        long milesPerHour = Math.round(calculatedValue);
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometersPerHour+ " km/h = " +milesPerHour + " mi/h");
        }
    }

}
