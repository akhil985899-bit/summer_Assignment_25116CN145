import java.util.Scanner;

public class ques9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Take input number
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        boolean prime = true;
        // when n = 1 and less then 1 is not prime
        if (n <= 1) {
            prime = false;

            }
            // check factor given number
        for( int i = 2; i <= n/2; i++){
            if(n%i == 0){
                prime = false;
                break;
            }
        }   
        // check condition then print   
        if (prime) {
            System.out.println("Given number is prime");
        }
         else {
                System.out.println("Given number is not prime");
            }
            sc.close();
}
}