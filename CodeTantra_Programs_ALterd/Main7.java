import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();

    public void displayDetails() {
        System.out.println("Shape details");
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        circle.displayDetails();
        scanner.close();
    }
}
