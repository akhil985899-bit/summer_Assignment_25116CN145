import java.util.Scanner;

public class ques73 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        // Input number of coloumn
        System.out.print("Enter number of coloumn: ");
        int coloumn = sc.nextInt();

        int matrix1[][] = new int [row][coloumn];
        int matrix2[][] = new int [row][coloumn];
        int sum[][] = new int [row][coloumn];

        // Input matrix1 value
        System.out.println("Input the value of 1st matrix: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < coloumn; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        // Input matrix2 value
        System.out.println("Input the value of 2nd matrix: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < coloumn; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        // sum of matrix code
        for(int i = 0; i < row; i++){
            for(int j = 0; j < coloumn; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        // display sum of matrix
        System.out.println("Sum of Matrix is: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < coloumn; j++){
                System.out.print(sum[i][j] +  " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
