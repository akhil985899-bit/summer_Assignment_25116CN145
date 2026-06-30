import java.util.Scanner;

public class ques120 {
    static Scanner sc = new Scanner(System.in);

    static int[] roll = new int[5];
    static String[] name = new String[5];
    static int[] marks = new int[5];

    // Function to add student records
    public static void addStudent() {

        for (int i = 0; i < 5; i++) {

            System.out.println("\nEnter Details of Student " + (i + 1));

            System.out.print("Enter Roll Number: ");
            roll[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
        }
    }

    // Function to display records
    public static void displayStudent() {

        System.out.println("\n===== Student Records =====");

        for (int i = 0; i < 5; i++) {

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Roll Number : " + roll[i]);
            System.out.println("Name        : " + name[i]);
            System.out.println("Marks       : " + marks[i]);
        }
    }
    // Function to find highest marks
    public static void highestMarks() {

        int max = marks[0];

        for (int i = 1; i < 5; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("\nHighest Marks = " + max);
    }
    public static void main(String[] args) {
        addStudent();
        displayStudent();
        highestMarks();

        sc.close();
    }
}

