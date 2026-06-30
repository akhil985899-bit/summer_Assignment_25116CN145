 import java.util.Scanner;

public class ques117 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Arrays
        int[] rollNo = new int[n];
        String[] name = new String[n];
        int[] marks = new int[n];

        // Input student details
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Details of Student " + (i + 1));

            System.out.print("Enter Roll Number: ");
            rollNo[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
        }

        // Display student records
        System.out.println("\n===== Student Records =====");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Roll Number : " + rollNo[i]);
            System.out.println("Name        : " + name[i]);
            System.out.println("Marks       : " + marks[i]);
        }

        sc.close();
    }
}

