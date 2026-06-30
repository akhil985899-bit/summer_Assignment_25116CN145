import java.util.Scanner;

public class ques119 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of employees
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Arrays
        int[] empId = new int[n];
        String[] empName = new String[n];
        double[] salary = new double[n];

        // Input employee details
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Details of Employee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            empId[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            empName[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
        }

        // Display employee details
        System.out.println("\n===== Employee Records =====");

        for (int i = 0; i < n; i++) {

            System.out.println("\nEmployee " + (i + 1));
            System.out.println("Employee ID   : " + empId[i]);
            System.out.println("Employee Name : " + empName[i]);
            System.out.println("Salary        : ₹" + salary[i]);
        }

        sc.close();
    }
}

