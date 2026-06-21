import java.util.Scanner;

public class ques83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        // Traverse each character of the string
        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));
            // Check if character is an alphabet
            if (ch >= 'a' && ch <= 'z') {

                // Check for vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);

        sc.close();
    }
}

