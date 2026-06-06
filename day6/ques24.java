import java.util.Scanner;

public class ques24 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
       // Taking input for the base
        System.out.println("Enter the base of number: ");
        int  base = sc.nextInt();
       // Taking input for the exponent (power)
        System.out.println("Enter the power of number: ");
        int power = sc.nextInt();
        int ans = 1;
        for(int i = 1; i <= power; i++){
            ans *= base;
        }
        System.out.println(base + "^" + power + "=" + ans);
        sc.close();
    }
}
