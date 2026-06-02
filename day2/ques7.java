import java.util.Scanner;

public class ques7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int pro = 1;
        int ld = 0;
        while(n>0){
            ld = n%10;
            pro = pro * ld;
            n = n/10;
        }
      System.out.println("Product of given number is: "+ pro);

      sc.close();
    }
}
