package Aufin;

import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " (" + marks + ")";
    }
}

class MarksComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.marks - s1.marks;  
    }
}

public class CustomComparatorExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Aufin", 85),
            new Student("Arun", 92),
            new Student("Roshan", 98)
        );

        Collections.sort(students, new MarksComparator());
        for (Student s : students) System.out.println(s);
    }
}
