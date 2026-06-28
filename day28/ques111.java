import java.util.Scanner;

public class ques111 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ticketPrice = 250;

        // Input details
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        System.out.print("Enter Seat Type (Silver/Gold): ");
        String seatType = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        // Calculate total amount
        int totalAmount = ticketPrice * tickets;

        // Display ticket details
        System.out.println("\n===== Ticket Details =====");
        System.out.println("Customer Name : " + name);
        System.out.println("Movie Name    : " + movie);
        System.out.println("Seat Type     : " + seatType);
        System.out.println("Ticket Price  : ₹" + ticketPrice);
        System.out.println("No. of Tickets: " + tickets);
        System.out.println("Total Amount  : ₹" + totalAmount);
        System.out.println("Booking Status: Confirmed");

        sc.close();
    }
}

