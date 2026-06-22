 import java.util.Scanner;

public class ques88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Remove all spaces
        str = str.replace(" ", "");

        // Display result
        System.out.println("String after removing spaces: " + str);

        sc.close();
    }
}

