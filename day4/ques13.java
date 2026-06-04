import java.util.Scanner;

public class ques13 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        // taking input how to print fabonacci series
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
     //   series start from 0
     // series is 0 1 1 2 3 5 8 13 21 
        int a = 0;
        int b = 1;
        int temp;
        for(int i = 1; i <= n; i++){
            // print a 
            System.out.print(a + " ");
            // logic of the code
            temp = a;
            a = b;
             b = temp +b;
        }
        sc.close();
    }
}

