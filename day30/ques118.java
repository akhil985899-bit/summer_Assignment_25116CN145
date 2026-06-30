import java.util.Scanner;

public class ques118 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of books
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Arrays
        int[] bookId = new int[n];
        String[] bookName = new String[n];
        String[] author = new String[n];

        // Input book details
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Details of Book " + (i + 1));

            System.out.print("Enter Book ID: ");
            bookId[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Book Name: ");
            bookName[i] = sc.nextLine();

            System.out.print("Enter Author Name: ");
            author[i] = sc.nextLine();
        }

        // Display book details
        System.out.println("\n===== Library Books =====");

        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1));
            System.out.println("Book ID     : " + bookId[i]);
            System.out.println("Book Name   : " + bookName[i]);
            System.out.println("Author Name : " + author[i]);
        }

        sc.close();
    }
}

