import java.util.Scanner;

public class ques84 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to uppercase
        String upper = str.toUpperCase();

        // Display result
        System.out.println("Uppercase string: " + upper);

        sc.close();
    }
}

