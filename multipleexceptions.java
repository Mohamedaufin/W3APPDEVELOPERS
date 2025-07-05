package project1;

public class multipleexceptions {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 10;  
            int result = 10 / 0; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e);
        } catch (Exception e) {
            System.out.println("General exception: " + e);
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
