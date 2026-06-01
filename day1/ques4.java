import java.util.Scanner;
public class ques4 {
    public static void main(String[] args){
        System.out.print("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int digit = 0;
    while (n>0) {
        digit = digit + 1;
        n = n/10;
    }
    System.out.println("Digit of number is: " + digit);
    sc.close();
}
}