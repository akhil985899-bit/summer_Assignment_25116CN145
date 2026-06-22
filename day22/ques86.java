 import java.util.Scanner;

public class ques86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Remove extra spaces from the beginning and end
        sentence = sentence.trim();

        int count = 0;

        // Check if the sentence is not empty
        if (!sentence.isEmpty()) {
            // Split the sentence into words
            String[] words = sentence.split("\\s+");
            count = words.length;
        }

        // Display result
        System.out.println("Number of words: " + count);

        sc.close();
    }
}

