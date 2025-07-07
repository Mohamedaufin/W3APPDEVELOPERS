package Superclass;

import java.util.*;

public class PhoneDirectory {
    public static void main(String[] args) {
        HashMap<String, String> phoneDirectory = new HashMap<>();

        phoneDirectory.put("Alice", "9876543210");
        phoneDirectory.put("Bob", "9123456780");
        phoneDirectory.put("Charlie", "9012345678");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        if (phoneDirectory.containsKey(name)) {
            System.out.println(name + "'s number: " + phoneDirectory.get(name));
        } else {
            System.out.println("Name not found.");
        }

        sc.close();
    }
}
