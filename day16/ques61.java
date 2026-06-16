    import java.util.Scanner;

public class ques61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number = " + missingNumber);

        sc.close();
    }
}

