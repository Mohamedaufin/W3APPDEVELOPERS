package Superclass;

class Box<T> {
    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class MethodImplementation {
    public static <T> void printArray(T[] arr) {
        for (T item : arr)
            System.out.println(item);
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setValue(123);
        System.out.println("Boxed value: " + intBox.getValue());

        String[] strArr = {"Java", "Python", "C++"};
        System.out.println("Array elements:");
        printArray(strArr);
    }
}
