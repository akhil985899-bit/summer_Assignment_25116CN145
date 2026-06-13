import java.util.Scanner;

public class ques51 {
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
             int largest = arr[0];
             int smallest = arr[0];
            // largest element of array
            // smallest element of array
        for(int i = 0; i < n; i++){
             if (arr[i] > largest ) {
                largest = arr[i];
             }
             if (arr[i] < smallest) {
                smallest = arr[i];
             }
        }
       
       System.out.println("Largest element of given array is: " + largest);
       System.out.println("Smallest element of given array is: " + smallest);

       sc.close();
}
}