import java.util.Scanner;

public class ques23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //  Taking input decimal number 
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int ld = 0;
        int count = 0;
        while (n != 0) {
            ld = n%2;
            if (ld == 1) {
                count ++;
            }
            n = n/2;
        }
        System.out.println("set bits in a number is: "+ count);
        sc.close();
    }    
}
