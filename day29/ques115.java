 import java.util.Scanner;

public class ques115 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        // Display menu
        System.out.println("\n===== STRING OPERATIONS =====");
        System.out.println("1. Find Length");
        System.out.println("2. Convert to Uppercase");
        System.out.println("3. Convert to Lowercase");
        System.out.println("4. Reverse String");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.println("Length = " + str.length());

        } 
        else if (choice == 2) {

            System.out.println("Uppercase = " + str.toUpperCase());

        } 
        else if (choice == 3) {

            System.out.println("Lowercase = " + str.toLowerCase());

        } 
        else if (choice == 4) {

            String reverse = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reverse = reverse + str.charAt(i);
            }

            System.out.println("Reversed String = " + reverse);

        } 
        else {

            System.out.println("Invalid Choice!");

        }

        sc.close();
    }
}

