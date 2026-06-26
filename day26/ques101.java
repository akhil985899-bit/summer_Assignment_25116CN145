 import java.util.Scanner;
import java.util.Random;

public class ques101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int number = random.nextInt(100) + 1;

        int guess;
        int attempts = 0;

        System.out.println("===== Number Guessing Game =====");
        System.out.println("Guess a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            attempts++;

            if (guess > number) {
                System.out.println("Too High!");
            } 
            else if (guess < number) {
                System.out.println("Too Low!");
            } 
            else {
                System.out.println("Congratulations! You guessed the correct number.");
            }

        } while (guess != number);

        System.out.println("Number of attempts: " + attempts);

        sc.close();
    }
}
