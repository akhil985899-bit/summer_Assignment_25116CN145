  import java.util.Arrays;
import java.util.Scanner;

public class ques91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Check if lengths are different
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams.");
            sc.close();
            return;
        }
        // Convert strings into character arrays
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Compare the sorted arrays
        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Strings are anagrams.");
        } else {
            System.out.println("Strings are not anagrams.");
        }
        sc.close();
    }
}

