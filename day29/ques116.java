import java.util.Scanner;

public class ques116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input product details
        System.out.print("Enter Product ID: ");
        int productId = sc.nextInt();

        sc.nextLine(); // Consume newline

        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Product Quantity: ");
        int quantity = sc.nextInt();

        // Calculate total value
        double totalValue = price * quantity;

        // Display inventory details
        System.out.println("\n===== Inventory Details =====");
        System.out.println("Product ID       : " + productId);
        System.out.println("Product Name     : " + productName);
        System.out.println("Product Price    : ₹" + price);
        System.out.println("Product Quantity : " + quantity);
        System.out.println("Total Value      : ₹" + totalValue);

        sc.close();
    }
}

