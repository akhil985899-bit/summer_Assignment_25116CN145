import java.util.Scanner;

public class ques22 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        // input binary number
        System.out.println("Enter a number: "); 
        int n = sc.nextInt();
        int ld = 0;
        int ans = 0;
        int power = 1; // power of 2^0 is 1 
        while (n != 0) {
            ld = n%10;
            ans += (power * ld);
            n /= 10;
            power *= 2;
        }
        System.out.println("After conversion to decimal is: " + ans);
        sc.close();
    }
}
