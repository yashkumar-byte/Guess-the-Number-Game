import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;
    private Scanner sc =new
    Scanner(System.in);

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100)+1;
    }
    void takeUserInput(){
        System.out.println("Guess the Number(1-100):");
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.format("You guessed It Right, it was %d\nYou Guessed it in %d attempts",number,noOfGuesses);
            return true;
        }
        else if (inputNumber<number){
            System.out.println("Too Low...");
        } else if (inputNumber>number) {
            System.out.println("Too High...");
        }
        return false;
    }
    void closeScanner(){
        sc.close();
    }
}

public class GuessNumber {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b = false;
        while (!b){
        g.takeUserInput();
        b =g.isCorrectNumber();
        }
        g.closeScanner();
    }
}
