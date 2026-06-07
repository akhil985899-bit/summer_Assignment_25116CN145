    import java.util.Scanner;

public class ques28 {

    static int reverse = 0;

    // Recursive method to reverse a number
    public static int reverseNumber(int n) {
        if (n == 0) {   // Base case
            return reverse;
        }

        reverse = reverse * 10 + (n % 10);
        return reverseNumber(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Reversed number = " + reverseNumber(n));

        sc.close();
    }
}

