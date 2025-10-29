// Abstract class Shape
abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();

    // Concrete method to display details
    void displayDetails() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

// Circle class extending Shape
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

// Main class to test the implementation
public class Experiment7_AbstractShape {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);  // Example radius = 5.0
        c.displayDetails();
    }
}
