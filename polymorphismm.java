package project1;

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    void move() {
        System.out.println("Bike is riding");
    }
}

public class polymorphismm {  
    public static void main(String[] args) {
        Vehicle v;
        v = new Car();
        v.move();  
        v = new Bike();
        v.move();  
    }
}
