import java.util.Scanner;

public class ques18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Taking input 
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int ld = 0;
        int sum = 0;
        int temp = n;
         while(n!=0){
            // find last digit
            ld = n%10;
             int fact = 1;
             // Calculate factorial of digit
            for(int i = 1; i <= ld;i++){
                fact*= i;
            }
         //   and add factorial value in sum
            sum += fact;
            // for reduce last digit of  Given number
            n = n/10;
         }
       // Check if the sum of factorials of digits
       // is equal to the original number
        if (temp == sum) {
            System.out.println("Given number is strong number");
        }
        else{
            System.out.println("Given number is not strong number");
        }
        sc.close();
    }
}
