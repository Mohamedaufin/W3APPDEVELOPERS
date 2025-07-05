package project1;
interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}

public class interfacee {  
    public static void main(String[] args) {
        Shape s = new Circle(5);
        System.out.println("Area: " + s.area());
        System.out.println("Perimeter: " + s.perimeter());
    }
}
