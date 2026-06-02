import java.util.Scanner;

public class ques8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        int ld = 0;
        while(n>0){
            ld = n%10;
            rev = rev*10 + ld;
            n = n/10;
        }
        if (temp == rev) {
            System.out.println("Given number is palindrome");
        }
        else{
            System.out.println("Given number is not palindrome");
        }
        sc.close();
    }
}
