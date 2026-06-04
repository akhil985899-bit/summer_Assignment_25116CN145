import java.util.Scanner;

public class ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking range input from user
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        // Check each number in the range
        for (int num = start; num <= end; num++) {
          int temp = num; // Store original number
            int sum = 0;
            // Find sum of cubes of digits
            while (temp != 0) {
                int ld = temp % 10;      // Extract last digit
                sum = sum + ld * ld * ld; // Add cube of digit
                temp = temp / 10;        // Remove last digit
            }
            // Check Armstrong condition
            if (sum == num) {
             System.out.println("Armstrong number: " + num);
            }
        }
        sc.close();
    }
}