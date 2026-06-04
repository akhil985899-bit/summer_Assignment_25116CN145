import java.util.Scanner;

public class ques15 {
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
        // taking input to check armstrong or not 
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int ld = 0;
        int cubeOfDigit = 0;
        int sum = 0;
        int temp = n;
        while( n!= 0){
            // logic of code
            ld = n%10;
            cubeOfDigit = ld*ld*ld;
            sum = sum + cubeOfDigit;
            n= n/10;
        }
        // check armstrong condition 
         // A 3-digit Armstrong number is equal to the sum of cubes of its digits
        if(temp == sum){
            System.out.println("Given number is armstrong");
        }
        else{
            System.out.println("Given number is not armstrong");
        }

        sc.close();
    }
}
