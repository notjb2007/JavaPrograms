import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) { length = l; width = w; }
    double calculateArea() { return length * width; }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) { base = b; height = h; }
    double calculateArea() { return 0.5 * base * height; }
}

public class GeometryCalculator5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape;
        while (true) {
            System.out.println("Select an option");
            System.out.println("1. Area of triangle");
            System.out.println("2. Area of rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("base: ");
                    double b = sc.nextDouble();
                    System.out.print("height: ");
                    double h = sc.nextDouble();
                    shape = new Triangle(b, h);
                    System.out.println("Area: " + shape.calculateArea());
                    break;
                case 2:
                    System.out.print("length: ");
                    double l = sc.nextDouble();
                    System.out.print("width: ");
                    double w = sc.nextDouble();
                    shape = new Rectangle(l, w);
                    System.out.println("Area: " + shape.calculateArea());
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
