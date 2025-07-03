package Superclass;

import java.util.*;

public class Car {
    String brand, model, color;
    int year;
    double mileage;

    public Car(String brand, String model, int year, double mileage, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.color = color;
    }

    void display() {
        System.out.println(brand + " " + model + " (" + color + ", " + year + ") - " + mileage + " km/l");
    }

    void checkAge() {
        if (year < 2015)
            System.out.println("Old car.");
        else
            System.out.println("New car.");
    }

    public static void main(String[] args) {
        Car c = new Car("Toyota", "Camry", 2012, 15.5, "Red");
        c.display();
        c.checkAge();
    }
}

