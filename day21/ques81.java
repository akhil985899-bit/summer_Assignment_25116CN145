import java.util.Scanner;

 public class ques81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // convert string into character array
        char[] arr = str.toCharArray();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count++;
        }

        System.out.println("Length of string = " + count);

        sc.close();
    }
}

