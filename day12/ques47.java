import java.util.Scanner;
public class ques47 {
    public static void fibonacci(int n){
        
        int a = 0;
        int b = 1;
        int temp = n;
        for(int i = 1; i<= n; i++){
            System.out.print(a + " ");
            temp = a;
               a = b;
               b = a+ temp;

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        fibonacci(n);
        sc.close();
    }
    }

