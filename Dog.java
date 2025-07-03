package project1;
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

public class Dog extends Animal {
    String breed;

    void bark() {
        System.out.println(name + " is barking.");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Rocky";
        d.breed = "Labrador";

        d.display();
        d.eat();
        d.sleep();
        d.bark();
    }
}
