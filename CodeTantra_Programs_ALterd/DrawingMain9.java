import java.util.Scanner;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape {
    private double radius;
    public Circle(double radius) { this.radius = radius; }
    public double calculateArea() { return Math.PI * radius * radius; }
    public double calculatePerimeter() { return 2 * Math.PI * radius; }
}

class Rectangle implements Shape {
    private double length, width;
    public Rectangle(double length, double width) { this.length = length; this.width = width; }
    public double calculateArea() { return length * width; }
    public double calculatePerimeter() { return 2 * (length + width); }
}

public class DrawingMain9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius of the circle ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);
        System.out.print("length of the rectangle ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("width of the rectangle ");
        double rectangleWidth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
        scanner.close();

        System.out.printf("Area of circle: %.2f, Perimeter: %.2f\n", circle.calculateArea(), circle.calculatePerimeter());
        System.out.printf("Area of rectangle: %.2f, Perimeter: %.2f\n", rectangle.calculateArea(), rectangle.calculatePerimeter());
    }
}
