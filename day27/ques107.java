 import java.util.Scanner;

public class ques107 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Employee details
        int empId = 0;
        String empName = "";
        double basicSalary = 0;
        double hra = 0;
        double da = 0;
        double netSalary = 0;

        int choice;

        do {
            // Display Menu
            System.out.println("\n===== Salary Management System =====");
            System.out.println("1. Enter Employee Details");
            System.out.println("2. Calculate Salary");
            System.out.println("3. Display Salary Details");
            System.out.println("4. Exit");

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

                    System.out.print("Enter Basic Salary: ");
                    basicSalary = sc.nextDouble();

                    System.out.println("Employee Details Saved Successfully!");
                    break;

                case 2:
                    hra = basicSalary * 0.20;   // 20% HRA
                    da = basicSalary * 0.10;    // 10% DA
                    netSalary = basicSalary + hra + da;

                    System.out.println("Salary Calculated Successfully!");
                    break;

                case 3:
                    System.out.println("\n----- Salary Details -----");
                    System.out.println("Employee ID   : " + empId);
                    System.out.println("Employee Name : " + empName);
                    System.out.println("Basic Salary  : ₹" + basicSalary);
                    System.out.println("HRA (20%)     : ₹" + hra);
                    System.out.println("DA (10%)      : ₹" + da);
                    System.out.println("Net Salary    : ₹" + netSalary);
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

