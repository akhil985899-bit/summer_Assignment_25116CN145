import java.util.Scanner;

public class ques6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int ld = 0;
        int rev = 0;
        while (n>0){
            ld = n%10;
            rev = rev*10 + ld;
            n = n/10;
        }
        System.out.println("Reverse of given number is: " + rev);
        sc.close();
    }
}
