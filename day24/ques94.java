import java.util.Scanner;

public class ques94 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 1;

        // Traverse the string
        for (int i = 0; i < str.length(); i++) {

            // Count repeated characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Print character and count
            System.out.print(str.charAt(i) + "" + count);

            // Reset count
            count = 1;
        }

        sc.close();
    }
}

