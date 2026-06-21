 import java.util.Scanner;

public class ques82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Variable to store reversed string
        String rev = "";

        // Traverse the string from last character to first
        for (int i = str.length() - 1; i >= 0; i--) {

            // Add each character to the reversed string
            rev = rev + str.charAt(i);
        }

        // Display the reversed string
        System.out.println("Reversed string: " + rev);

        sc.close();
    }
}

