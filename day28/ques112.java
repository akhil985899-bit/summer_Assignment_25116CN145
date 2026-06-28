import java.util.Scanner;

public class ques112 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input contact details
        System.out.print("Enter Contact ID: ");
        int contactId = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Contact Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter Email ID: ");
        String email = sc.nextLine();

        // Display contact details
        System.out.println("\n===== Contact Details =====");
        System.out.println("Contact ID    : " + contactId);
        System.out.println("Contact Name  : " + name);
        System.out.println("Mobile Number : " + mobile);
        System.out.println("Email ID      : " + email);

        sc.close();
    }
}

