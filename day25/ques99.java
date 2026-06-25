import java.util.Scanner;

public class ques99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of names
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Create array to store names
        String[] names = new String[n];

        // Input names
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // Sort names alphabetically
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                // Compare two names
                if (names[i].compareTo(names[j]) > 0) {

                    // Swap names
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        // Display sorted names
        System.out.println("\nNames in Alphabetical Order:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
        sc.close();
    }
}

