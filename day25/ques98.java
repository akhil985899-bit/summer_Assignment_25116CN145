import java.util.Scanner;

public class ques98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.print("Common Characters: ");

        // Compare each character of str1 with str2
        for (int i = 0; i < str1.length(); i++) {

            char ch1 = str1.charAt(i);

            // Skip duplicate characters
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (str1.charAt(k) == ch1) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            // Check if character exists in second string
            for (int j = 0; j < str2.length(); j++) {
                if (ch1 == str2.charAt(j)) {
                    System.out.print(ch1 + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}


