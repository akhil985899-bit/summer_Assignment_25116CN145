import java.util.Scanner;

public class ques110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input account details
        System.out.print("Enter Account Number: ");
        int accountNo = sc.nextInt();

        sc.nextLine(); // Consume newline

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Deposit money
        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();
        balance = balance + deposit;

        // Withdraw money
        System.out.print("Enter Withdrawal Amount: ");
        double withdraw = sc.nextDouble();

        if (withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }

        // Display account details
        System.out.println("\n===== Bank Account Details =====");
        System.out.println("Account Number : " + accountNo);
        System.out.println("Account Holder : " + name);
        System.out.println("Available Balance : ₹" + balance);

        sc.close();
    }
}

