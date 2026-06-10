import java.util.Scanner;

public class ques40 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n-row; col++){
                System.out.print("  ");
            }
            for(int col = 1; col <= row; col++){
                char c = (char)('A' + col-1);
                System.out.print(c+ " ");
            }
            for(int col = row-1; col >= 1; col--){
                char c = (char)('A' + col-1);
                System.out.print(c+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
