import java.util.Scanner;

public class ques95 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        // Split the sentence into words
        String[] words = str.split(" ");

        // Assume the first word is the longest
        String longest = words[0];

        // Compare each word
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        // Print the longest word
        System.out.println("Longest Word: " + longest);
        System.out.println("Length: " + longest.length());

        sc.close();
    }
}

