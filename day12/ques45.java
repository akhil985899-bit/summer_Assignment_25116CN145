import java.util.Scanner;

public class ques45 {
    public static boolean palindrome(int n){
        int ld = 0;
        int rev = 0;
        int temp = n;
        while (n!=0){
            ld = n%10;
            rev = rev*10+ld;
            n = n/10;
        }
        return temp == rev;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    
    if (palindrome(n)) {
        System.out.println("Given number is palindrome");
    }
    else{
        System.out.println("Given number is not palindrome");
    }
    sc.close();
}
}
