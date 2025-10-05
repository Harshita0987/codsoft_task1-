import java.util.Scanner;
import java.util.Random;

public class Number_Guessinggame {

    private int random;

    Number_Guessinggame() {
        Random r = new Random();
        random = r.nextInt(100) + 1;
    }

    int guess(int guessNumber) {
        return guessNumber - random;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain;
        int score = 0;

        do {
            Number_Guessinggame game = new Number_Guessinggame();
            int guess;
            int result;
            int attempts = 0;
            int maxAttempts = 10;

            System.out.println("You have " + maxAttempts + " attempts to guess it!");

        do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();
            result = game.guess(guess);
            attempts++;

            if (result == 0) {
                System.out.println("Your guess is correct");
                score += (maxAttempts - attempts + 1);
                break;
            } else if (result < 0) {
                System.out.println("Guess higher");
            } else {
                System.out.println("Guess Lower");
            }

            if (attempts == maxAttempts) {
                System.out.println("You have used all your attempts. The correct number was " + game.random);
                break;
            }
        } while (result != 0);

        System.out.print("\nDo you want to play again? (yes/no): ");
        playAgain = sc.next().toLowerCase().startsWith("y");

          } while (playAgain);

        System.out.println("Your total score is: " + score);
        System.out.println(" Thanks for playing!");
        sc.close();
        }
    }
    


    

