import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();

    void displayDetails() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Main class
public class Experiment8_RectangleAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle Input
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        Rectangle rect = new Rectangle(length, width);
        rect.displayDetails();

        // Circle Input
        double radius = sc.nextDouble();
        Circle circ = new Circle(radius);
        circ.displayDetails();
    }
}
