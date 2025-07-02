package Array;
import java.util.*;

public class Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        Arrays.sort(a); 
        System.out.println("Sorted:");
        for(int x : a) System.out.print(x + " ");

        int key = sc.nextInt(); 
        for(int i = 0; i < n; i++) {
            if(a[i] == key) {
                System.out.println("\nFound at position: " + (i + 1));
                return;
            }
        }
        System.out.println("\nNot found");
   

	}

}
