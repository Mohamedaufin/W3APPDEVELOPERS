import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your grade (A/B/C/D/F): ");
        char grade = sc.next().toUpperCase().charAt(0);  // Takes first character and converts to uppercase

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Very Good!");
                break;
            case 'C':
                System.out.println("Good.");
                break;
            case 'D':
                System.out.println("Needs Improvement.");
                break;
            case 'F':
                System.out.println("Failed.");
                break;
            default:
                System.out.println("Invalid grade entered.");
        }

        sc.close();
    }
}
