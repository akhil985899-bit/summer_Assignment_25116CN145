import java.util.Scanner;

public class ques48 {
    public static boolean perfectNumber(int n){
        int sum = 0;
        for(int i = 1; i<= n-1; i++) {
            if(n%i == 0){
                sum += i;
            }
        }
        return sum == n;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(perfectNumber(n)){
            System.out.println("Given number is perfect number");
        }
        else{
            System.out.println("Given number is not perfect number");
        }
        sc.close();
    }
}
