import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();

    void displayDetails() {
        System.out.println("Shape details");
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

class Rectangle extends Shape {
    double length, width;
    void inputDetails(Scanner scanner) {
        System.out.print("Enter the length of the rectangle ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle ");
        width = scanner.nextDouble();
    }
    double calculateArea() { return length * width; }
    double calculatePerimeter() { return 2 * (length + width); }
}

class Circle extends Shape {
    double radius;
    void inputDetails(Scanner scanner) {
        System.out.print("Enter the radius of the circle ");
        radius = scanner.nextDouble();
    }
    double calculateArea() { return Math.PI * radius * radius; }
    double calculatePerimeter() { return 2 * Math.PI * radius; }
}

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        rectangle.inputDetails(scanner);
        rectangle.displayDetails();
        Circle circle = new Circle();
        circle.inputDetails(scanner);
        circle.displayDetails();
        scanner.close();
    }
}
