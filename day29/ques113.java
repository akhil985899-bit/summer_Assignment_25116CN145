import java.util.Scanner;

public class ques113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display Menu
        System.out.println("===== Calculator =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        // Input numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Perform operation
        if (choice == 1) {
            System.out.println("Result = " + (num1 + num2));
        } 
        else if (choice == 2) {
            System.out.println("Result = " + (num1 - num2));
        } 
        else if (choice == 3) {
            System.out.println("Result = " + (num1 * num2));
        } 
        else if (choice == 4) {
            if (num2 != 0) {
                System.out.println("Result = " + (num1 / num2));
            } else {
                System.out.println("Division by zero is not possible.");
            }
        } 
        else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}

