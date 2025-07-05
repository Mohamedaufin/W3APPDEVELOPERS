package project1;

public class tryfinally {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("This block always executes (finally)");
        }
    }
}

