import java.util.Scanner;

public class ques49 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
         int arr[] = new int[n];
        // Input array=
        System.out.println("Input the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // Display array
        System.out.println("Given array is: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
}
}
