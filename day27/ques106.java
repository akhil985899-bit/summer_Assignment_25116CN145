import java.util.Scanner;

public class ques106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Employee details
        int empId = 0;
        String empName = "";
        double salary = 0;

        int choice;

        do {
            // Display Menu
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Employee ID: ");
                    empId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName = sc.nextLine();

                    System.out.print("Enter Employee Salary: ");
                    salary = sc.nextDouble();

                    System.out.println("Employee Record Added Successfully!");
                    break;

                case 2:
                    System.out.println("\n----- Employee Details -----");
                    System.out.println("Employee ID   : " + empId);
                    System.out.println("Employee Name : " + empName);
                    System.out.println("Salary        : ₹" + salary);
                    break;

                case 3:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}

