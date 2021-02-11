package learnjava.programming;

public class Main {

    public static void main(String[] args) {

        int result = 1+2;
        System.out.println("1+2= " +result);
        int previousResult = result;
        System.out.println("previousResult= " +previousResult);
        result = result-1;
        System.out.println("3-1= "+result);

        System.out.println("previousResult= " +previousResult);

        result = result * 10;
        System.out.println("2*10= "+result);
        result = result / 5;
        System.out.println("20/5= "+result);
        result = result % 3;
        System.out.println("4%3= "+result);

        result++; // result=result+1;
        System.out.println("1+1= "+result);

        result--; // result=result-1;
        System.out.println("2-1= "+result);

        result+=2; // result=result+2;
        System.out.println("1+2= "+result);

        result*=10; // result=result*10;
        System.out.println("3*10= " +result);

        result/=3; // result=result/3;
        System.out.println("30/3= "+result);

        boolean isAlien=false;

        if(isAlien==false) {
            System.out.println("It is not an Alien");
            System.out.println("I am scared of aliens");
        }

        int topScore=80;
        if(topScore<100){
            System.out.println("You got the high score!");
        }
        int secondTopscore=60;
        if((topScore>secondTopscore) && (topScore<100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore>90) || (secondTopscore<90)){
            System.out.println("Either or both the conditions are true");
        }

        int newValue=50;
        if(newValue==50) // newValue is int variable, condition in if statement requires boolean, so we use ==
            System.out.println("This is True");

        boolean isCar=false; //Here isCar variable is boolean
        if(isCar=true) // so no error is shown here if we use single = sign here
            System.out.println("This is not supposed to happen");

        int x=10;
        boolean y = x==10 ? true : false; // here y is assigned true
        System.out.println("x is true");

        //challenge
        double d1=20.00;
        double d2=80.00;
        double d3=(d1+d2)*100;
        System.out.println(d3);
        double r = d3%40.00;
        System.out.println(r);

        boolean isNoRemainder = (r==0) ? true : false;
        System.out.println("isNoRemainder is: " +isNoRemainder);
        if(!isNoRemainder)
            System.out.println("Got some remainder");
    }
}
