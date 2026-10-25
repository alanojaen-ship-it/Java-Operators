
import java.util.Scanner;

public class code_ffc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("===== CALCULATOR =====");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
            System.out.println("Modulus: " + (num1 % num2));
        } else {
            System.out.println("Division: Undefined");
            System.out.println("Modulus: Undefined");
        }

        input.close();
    }
}