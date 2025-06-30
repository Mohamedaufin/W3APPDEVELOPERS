package project1;
import java.util.Scanner;
public class Student {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        char gender;
        String studentID;
        float marks;
        boolean isPassed;
        
        System.out.println("Enter Student Name: ");
        name = sc.nextLine();
        
        System.out.println("Enter student age: ");
        age = sc.nextInt();
        
        System.out.println("Enter Gender (M/F):");
        gender = sc.next().charAt(0);
        
        System.out.println("Enter student id: ");
        studentID = sc.next();
        
        System.out.println("Enter marks out of 100");
        marks = sc.nextFloat();
        
        isPassed =marks >=40;
        
        System.out.println("\n Student details");
        System.out.println("name: " +name);
        System.out.println("age: " +age);
        System.out.println("Gender: " +gender);
        System.out.println("StudentID: " +studentID);
        System.out.println("Marks: " +marks);
        System.out.println("Passed: " +isPassed);
}
}