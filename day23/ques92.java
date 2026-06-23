 import java.util.Scanner;

public class ques92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take string input from the user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int maxCount = 0;
        char maxChar = ' ';

        // Check each character one by one
        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            // Count how many times the current character appears
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            // Update maximum count and character
            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }
        // Print the result
        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Frequency: " + maxCount);
        sc.close();
    }
}

