import java.util.Scanner;

public class ques89 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take string input from the user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Check each character one by one
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            // Count how many times the current character appears
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            sc.close();
            // If the character appears only once, print it and stop
            if (count == 1) {
                System.out.println("First non-repeating character: " + str.charAt(i));
                return;
            }
        }

        // If no non-repeating character is found
        System.out.println("No non-repeating character found.");
        
    }
}

