package Superclass;

import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class LabListSort {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Zara"));
        students.add(new Student(1, "Amit"));
        students.add(new Student(2, "John"));

       
        Collections.sort(students, (a, b) -> a.id - b.id);

        System.out.println("Sorted by ID:");
        for (Student s : students)
            System.out.println(s.name + " (" + s.id + ")");
    }
}
