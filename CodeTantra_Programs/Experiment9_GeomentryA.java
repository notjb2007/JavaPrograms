import java.util.Scanner;

// Shape interface with two abstract methods
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Circle class implementing Shape
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main class with menu
public class Experiment9_GeomentryA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose shape:\n1. Circle\n2. Rectangle");
        int choice = sc.nextInt();

        Shape s = null;

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                s = new Circle(r);
                break;
            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter width: ");
                double w = sc.nextDouble();
                s = new Rectangle(l, w);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Area: " + s.calculateArea());
        System.out.println("Perimeter: " + s.calculatePerimeter());
    }
}
