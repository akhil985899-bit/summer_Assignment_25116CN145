import java.util.Scanner;

public class ques50 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            // Input array 
            System.out.println("Input the array");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            // sum the array
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        // average array
        float average = (float)sum/n;
        // Display sum and average of array
       System.out.println("sum of given array is: " + sum);
       System.out.println("Average of given array is: " + average);

       sc.close();
    }
}
