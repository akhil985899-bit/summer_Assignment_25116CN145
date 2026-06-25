 import java.util.Scanner;

public class ques100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Sort words according to their length
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {

                // Compare lengths of two words
                if (words[i].length() > words[j].length()) {

                    // Swap the words
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        // Display sorted words
        System.out.println("\nWords sorted by length:");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        sc.close();
    }
}

