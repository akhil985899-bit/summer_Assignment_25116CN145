 import java.util.Scanner;
 public class ques17{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        // Taking input the value
        System.out.println("Enter the number");
            int n = sc.nextInt(); 
            int sum= 0;
            for(int i = 1; i <= n/2; i++){
                // condition check i is factor of number or not 
                if(n%i == 0)
                    // if i is factor of number so add sum 
                    sum += i;
        }
        // check given number equal to its factor sum
        // if true then print given number is perfect number 
        if(sum == n){
            System.out.println("Given number is perfect number");}
        else{
            System.out.println("Given number is not perfect number");}
    
        sc.close();
    }
 }