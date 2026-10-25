
import java.util.Scanner;

public class code_gtc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter average grade: ");
        double average = input.nextDouble();

        System.out.print("Enter number of absences: ");
        int absences = input.nextInt();

        boolean passed = (average >= 75 && absences <= 3)
                         || (average >= 90);

        System.out.println("===== GRADE CHECKER =====");
        System.out.println("Average Grade: " + average);
        System.out.println("Absences: " + absences);

        if (passed) {
            System.out.println("Result: PASS");

            if (average >= 90) {
                System.out.println("Reason: Average is 90 or above.");
            } else {
                System.out.println("Reason: Grade and attendance requirements met.");
            }
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: Grade or attendance requirements not met.");
        }

        input.close();
    }
}