import java.util.Scanner;

public class ques19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Taking input
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            // check factor 
            if(n%i == 0){
                System.out.println("Factor of given number is: " + i);
            }
        } 
        sc.close();
    }
}
