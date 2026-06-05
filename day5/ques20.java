import java.util.Scanner;

public class ques20 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int largest = -1;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {   // i is a factor of n

                int count = 0;

                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {   // i is prime
                    largest = i;
                }
            }
        }
        System.out.println("Largest prime factor = " + largest);
        sc.close();
    }
}