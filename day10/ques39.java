   import java.util.Scanner;

public class ques39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {

            // spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // increasing numbers
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            // decreasing numbers
            for (int col = row - 1; col >= 1; col--) {
                System.out.print(col);
            }

            System.out.println();
        }

        sc.close();
    }
}