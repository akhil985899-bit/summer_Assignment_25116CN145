import java.util.Scanner;

public class ques52 {
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
             int even = 0;
             int odd = 0;
            // even element of array
            // odd element of array 
        for(int i = 0; i < n; i++){
             if (arr[i]%2 == 0 ) {
                even++;
             }
             else{
                odd++;
             }
        }
       System.out.println("Even element of given array is: " + even);
       System.out.println("Odd element of given array is: " + odd);

       sc.close();
}
}
