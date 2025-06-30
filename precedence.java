package project1;
import java.util.Scanner;
public class precedence {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter value of a:");
        a = sc.nextInt();

        System.out.println("Enter value of b:");
        b = sc.nextInt();

        System.out.println("Enter value of c:");
        c = sc.nextInt();

        // Basic arithmetic operations
        System.out.println("\n--- Basic Arithmetic Operations ---");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // Operator Precedence Example
        System.out.println("\n--- Operator Precedence Example ---");
        int result1 = a + b * c;
        int result2 = (a + b) * c;

        System.out.println("Without brackets (a + b * c): " + result1);
        System.out.println("With brackets ((a + b) * c): " + result2);

        sc.close();

}
}