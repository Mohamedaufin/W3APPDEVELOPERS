package project1;

final class Constants {
    static final double PI = 3.14159;
}

enum Days {
    MONDAY, TUESDAY, WEDNESDAY;
}

public class staticc {
    static int count = 0;

    static void increment() {
        count++;
    }

    public static void main(String[] args) {
        System.out.println("PI: " + Constants.PI);
        System.out.println("Today is: " + Days.MONDAY);
        increment();
        increment();
        System.out.println("Count: " + count);
    }
}
