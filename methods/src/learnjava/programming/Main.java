package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int highScore = calculateScore(true,100, 10, 100);
        System.out.println(highScore);

        highScore = calculateScore(true,1000, 10, 100);
        System.out.println(highScore);

    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted*bonus);
            //System.out.println("Your final score was: " +finalScore);
            return finalScore;
        }
        else
            return -1;
    }
}