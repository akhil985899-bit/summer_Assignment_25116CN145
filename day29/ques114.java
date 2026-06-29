import java.util.Scanner;

public class ques114 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display menu
        System.out.println("\n===== Array Operations =====");
        System.out.println("1. Display Array");
        System.out.println("2. Find Sum");
        System.out.println("3. Find Maximum");
        System.out.println("4. Find Minimum");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Array Elements: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

        } 
        else if (choice == 2) {

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            System.out.println("Sum = " + sum);

        } 
        else if (choice == 3) {

            int max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Maximum Element = " + max);

        } 
        else if (choice == 4) {

            int min = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("Minimum Element = " + min);

        } 
        else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}

