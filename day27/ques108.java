import java.util.Scanner;

public class ques108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        // Input marks of 5 subjects
        System.out.print("Enter Marks of English: ");
        int english = sc.nextInt();

        System.out.print("Enter Marks of Hindi: ");
        int hindi = sc.nextInt();

        System.out.print("Enter Marks of Math: ");
        int math = sc.nextInt();

        System.out.print("Enter Marks of Science: ");
        int science = sc.nextInt();

        System.out.print("Enter Marks of Computer: ");
        int computer = sc.nextInt();

        // Calculate total and percentage
        int total = english + hindi + math + science + computer;
        double percentage = total / 5.0;

        // Calculate grade
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Check pass/fail
        String result;
        if (percentage >= 40) {
            result = "Pass";
        } else {
            result = "Fail";
        }
        // Display Marksheet
        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("-------------------------------");
        System.out.println("English      : " + english);
        System.out.println("Hindi        : " + hindi);
        System.out.println("Math         : " + math);
        System.out.println("Science      : " + science);
        System.out.println("Computer     : " + computer);
        System.out.println("-------------------------------");
        System.out.println("Total Marks  : " + total + "/500");
        System.out.println("Percentage   : " + percentage + "%");
        System.out.println("Grade        : " + grade);
        System.out.println("Result       : " + result);

        sc.close();
    }
}

