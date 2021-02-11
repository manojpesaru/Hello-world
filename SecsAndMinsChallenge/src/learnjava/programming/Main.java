package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(65,45));

        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int minutes, int secs){
        if((minutes<0) || (secs<0) || (secs>59)){
            return "Invalid value";
        }
        int hours = minutes/60;
        int remainingMinutes = minutes%60;

        String hoursString = hours + "h";
        if(hours<10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if(remainingMinutes<10){
            minutesString = "0" + minutesString;
        }

        String secondsString = secs + "s";
        if(secs<10){
            secondsString = "0" + secondsString;
        }

        return hoursString+ " "+ minutesString+ " "+ secondsString;
    }
    public static String getDurationString(int secs){
        if(secs<0){
            return "Invalid value";
        }
        int mints = secs/60;
        int remainingSecs = secs%60;
        return getDurationString(mints,remainingSecs);
    }
}
