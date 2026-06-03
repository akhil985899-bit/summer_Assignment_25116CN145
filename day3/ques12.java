import java.util.Scanner;

public class ques12 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = (a > b) ? a : b ;
        int lcm = max;
        while(lcm % a !=0 || lcm % b != 0){
            lcm++;
        }
        System.out.print("Lcm of given two number is: " + lcm);
        sc.close();
    }
}
