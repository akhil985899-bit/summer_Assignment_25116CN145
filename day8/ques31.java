import java.util.Scanner;

public class ques31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        // taking input
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
               char ch = (char)('A'+ col-1);
               System.out.print(ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
