import java.util.Scanner;

public class ques21 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        // Input decimal  number
        System.out.println("Enter the number");    
        int n = sc.nextInt();
        int ans = 0;
        int parity = 0;
        int power = 1; // power of 10^0 is 1 
        while (n > 0) {
            parity =  n%2;
            ans += (parity * power);
            n = n/2;
            power *= 10;
        }
        System.out.println("After conversion to binary is " + ans);
        sc.close();
    }
}
