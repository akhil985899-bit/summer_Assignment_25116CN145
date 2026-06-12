import java.util.Scanner;

public class ques46 {
    public static boolean Armstrong(int n){
        int ld = 0;
        int sum = 0;
        int temp = n;
        while (n!=0) {
            ld = n%10;
            sum = sum + ld*ld*ld;
            n = n/10;
        }
        return temp == sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (Armstrong(n)) {
            System.out.println("Given number Armstrong");
        }
        else{
            System.out.println("Given number is not Armstrong");

        }
        sc.close();
    }
}
