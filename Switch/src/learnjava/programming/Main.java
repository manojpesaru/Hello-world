package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char switchValue='A';

        switch (switchValue){
            case 'A':
                System.out.println("found: "+switchValue);
                break;
            case 'B':
                System.out.println("found: "+switchValue);
                break;
            default:
                System.out.println("not found");
                break;
        }

        String month = "JanUary";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("not sure");
        }
    }

}
