 import java.util.Scanner;

public class ques96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        // Traverse the string
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Add character only if it is not already present
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        // Print result
        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}

