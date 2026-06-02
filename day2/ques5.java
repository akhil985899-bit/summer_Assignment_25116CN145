import java.util.Scanner;

public class ques5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int ld = 0;
        while(n>0){
            ld = n % 10;
            sum = sum + ld;
            n = n/10;
        }
System.out.println("sum of given number is : " + sum);
sc.close();
    }
}
