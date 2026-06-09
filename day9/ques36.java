import java.util.Scanner;

public class ques36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            if(row == 1 || row == n){
                for(int col = 1; col <= n; col++){
                System.out.print("*");}
            }
            else{
                for(int col = 1; col <= n; col++){
                    if (col == 1 || col == n) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }   
        System.out.println();
    }
    sc.close();
}
}