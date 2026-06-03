import java.util.Scanner;

public class ques11 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = (a<b)?a:b;
        int hcf = 1;
        
        for(int i = min; i>= 1; i--){
            if(a%i == 0 && b%i == 0){
                hcf = i;
            break; 
            } 
        }
        System.out.println("gcd of given two number is "+ hcf );
    sc.close();
    } 
}
