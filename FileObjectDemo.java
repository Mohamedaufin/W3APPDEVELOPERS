package Superclass;

import java.io.*;

class Person implements Serializable {
    String fullName;
    int id;

    Person(String fullName, int id) {
        this.fullName = fullName;
        this.id = id;
    }
}

public class FileObjectDemo {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("Mohamed Aufin", 101);
            FileOutputStream fos = new FileOutputStream("person.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
            oos.close();
            fos.close();
            System.out.println("Object serialized.");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e);
        }

        try {
            FileInputStream fis = new FileInputStream("person.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person p2 = (Person) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Object deserialized:");
            System.out.println("Name: " + p2.fullName);
            System.out.println("ID: " + p2.id);
        } catch (Exception e) {
            System.out.println("Deserialization error: " + e);
        }
    }
}
