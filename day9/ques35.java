import java.util.Scanner;

public class ques35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            for(int  col = 1; col <= row; col++){
                char ch = (char)('A'+row-1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
