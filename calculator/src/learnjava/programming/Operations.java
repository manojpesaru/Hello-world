package learnjava.programming;

public class Operations {
    private int x;
    private int y;

    public Operations(int n1, int n2){
        x = n1;
        y = n2;
    }

    public int addition(){
        return x+y;
    }
    public int subtraction(){
        return x-y;
    }
    public int multiplication(){
        return x*y;
    }
    public int div(){
        return x/y;
    }

}
