
public class code_cgit {
    public static void main(String[] args) {

        double balance = 1000.00;

        System.out.println("===== BALANCE TRACKER =====");
        System.out.println("Initial Balance: " + balance);

        balance += 500;
        System.out.println("After Deposit: " + balance);

        balance *= 1.10;
        System.out.println("After 10% Growth: " + balance);

        balance += 200;
        System.out.println("After Second Deposit: " + balance);

        int count = 5;

        System.out.println("\n===== POSTFIX INCREMENT =====");
        System.out.println("Count++: " + count++);
        System.out.println("Count After: " + count);

        count = 5;

        System.out.println("\n===== PREFIX INCREMENT =====");
        System.out.println("++Count: " + ++count);
        System.out.println("Count After: " + count);
    }
}