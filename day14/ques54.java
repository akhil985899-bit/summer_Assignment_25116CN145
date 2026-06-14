import java.util.Scanner;

public class ques54 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // size of array
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        // Input of array
        System.out.println("Input array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number whose frequengy you want to find: ");
        int key = sc.nextInt();

        int count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == key){
                count++;
            }
        }
        System.out.print("Frequency of given number is: " + count);

        sc.close();
    }
}
