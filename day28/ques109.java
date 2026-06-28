import java.util.Scanner;

public class ques109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Book details
        int bookId = 0;
        String bookName = "";
        String author = "";
        boolean issued = false;

        int choice;

        do {
            // Display Menu
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Book Details");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Book ID: ");
                    bookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    bookName = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    author = sc.nextLine();

                    issued = false;

                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    if (!issued) {
                        issued = true;
                        System.out.println("Book Issued Successfully!");
                    } else {
                        System.out.println("Book is Already Issued!");
                    }
                    break;

                case 3:
                    if (issued) {
                        issued = false;
                        System.out.println("Book Returned Successfully!");
                    } else {
                        System.out.println("Book is Already Available!");
                    }
                    break;

                case 4:
                    System.out.println("\n----- Book Details -----");
                    System.out.println("Book ID      : " + bookId);
                    System.out.println("Book Name    : " + bookName);
                    System.out.println("Author Name  : " + author);

                    if (issued) {
                        System.out.println("Status       : Issued");
                    } else {
                        System.out.println("Status       : Available");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

