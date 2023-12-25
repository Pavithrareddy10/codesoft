import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();
        int minRange=1;
        int maxRange=100;
        int attemptsLimit=7;
        int rounds=0;
        int score=0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a nimber between "+minRange+"and"+maxRange+".");
        boolean playAgain=true;
        while(playAgain){
            int randomNumber=random.nextInt(maxRange-minRange+1)+minRange;
            int attempts=0;
            boolean guessedCorrectly=false;
            while(!guessedCorrectly && attempts<attemptsLimit){
                System.out.print("Enter your guess(Attempt"+(attempts+1)+"):");
                int userGuess=scanner.nextInt();
                attempts++;
                if(userGuess == randomNumber){
                    System.out.println("Congratulations! you guessed the number"+randomNumber+"correctly in"+attempts+"attempts.");
                    guessedCorrectly=true;
                    score+=attempts;
                }
                else if(userGuess<randomNumber){
                    System.out.println("Too low! Try again.");
                }
                else{
                    System.out.println("Too high! Try again.");


                }



            }
            if(!guessedCorrectly){
                System.out.println("Sorry,you've used all"+attemptsLimit+"attempts.The number was"+randomNumber+".");

            }
            rounds++;
            System.out.print("Do you want to play agian?(yes/no):");
            String playChoice=scanner.next().toLowerCase();
            playAgain=playChoice.equals("yes");

        }
        System.out.println("Game over!");
        System.out.println("Total Rounds played:"+rounds);
        System.out.println("Your score:"+score);
        scanner.close();
    
    }
    
}

