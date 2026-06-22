 import java.util.Scanner;

public class ques87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert string to character array
        char[] ch = str.toCharArray();

        // Count frequency of each character
        for (int i = 0; i < ch.length; i++) {

            // Skip already counted characters
            if (ch[i] == '0') {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '0'; // Mark as counted
                }
            }

            System.out.println(ch[i] + " = " + count);
        }

        sc.close();
    }
}

