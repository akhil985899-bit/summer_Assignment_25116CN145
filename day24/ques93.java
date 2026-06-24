 import java.util.Scanner;
public class ques93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first string
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        // Input second string
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Check if both strings have the same length
        if (s1.length() == s2.length()) {

            // Join the first string with itself
            String temp = s1 + s1;

            // Check if the second string is present in the joined string
            if (temp.contains(s2)) {
                System.out.println("Strings are rotations.");
            } else {
                System.out.println("Strings are not rotations.");
            }

        } else {
            System.out.println("Strings are not rotations.");
        }

        sc.close();
    }
}

