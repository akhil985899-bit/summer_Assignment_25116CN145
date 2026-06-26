 import java.util.Scanner;

 public class ques102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Input age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println(name + " is eligible to vote.");
        } else {
            System.out.println(name + " is not eligible to vote.");
            System.out.println("You can vote after " + (18 - age) + " year(s).");
        }

        sc.close();
    }
}
