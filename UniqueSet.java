package Superclass;

import java.util.*;

public class UniqueSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> uniqueSet = new HashSet<>();

        System.out.println("Enter 5 numbers (duplicates will be ignored):");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            uniqueSet.add(num);
        }

        System.out.println("Unique values:");
        for (int val : uniqueSet)
            System.out.println(val);

        sc.close();
    }
}
