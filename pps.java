
public class pps {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 2;

        System.out.println("===== EXPRESSION 1 =====");

        // Predicted: true
        boolean result1 = a + b * c > 15 && a > b;
        System.out.println("Result 1: " + result1);

        System.out.println("\n===== EXPRESSION 2 =====");

        // Predicted: false
        boolean result2 = a - b + c >= 10 || b * c < a;
        System.out.println("Result 2: " + result2);

        System.out.println("\n===== EXPRESSION 3 =====");

        // Predicted: true
        boolean result3 = ++a > 10 && b++ < 6;
        System.out.println("Result 3: " + result3);

        System.out.println("\n===== FINAL VALUES =====");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        System.out.println("\n===== EXPLANATION =====");
        System.out.println("Expression 1: Multiplication is evaluated before addition.");
        System.out.println("Expression 2: Arithmetic is evaluated before relational and logical operators.");
        System.out.println("Expression 3: Prefix increments before comparison, while postfix increments afterward.");
    }
}