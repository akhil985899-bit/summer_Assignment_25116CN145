import java.util.Scanner;

public class ques104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        int answer;

        System.out.println("===== QUIZ APPLICATION =====");

        // Question 1
        System.out.println("\n1. What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Chennai");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 2) {
            score++;
        }

        // Question 2
         System.out.println("\n1. Which planet is known as the Red Planet?");
        System.out.println("1. Earth");
        System.out.println("2. Mars");
        System.out.println("3. Venus");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 2) {
            score++;
        }

        // Question 3
        System.out.println("\n3. How many days are there in a week?");
        System.out.println("1. 5");
        System.out.println("2. 6");
        System.out.println("3. 7");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 3) {
            score++;
        }

        // Display result
        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score: " + score + " out of 3");

        if (score == 3) {
            System.out.println("Excellent!");
        } else if (score == 2) {
            System.out.println("Good Job!");
        } else if (score == 1) {
            System.out.println("Keep Practicing!");
        } else {
            System.out.println("Better Luck Next Time!");
        }

        sc.close();
    }
}

