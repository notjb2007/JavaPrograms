import java.util.Scanner;

// Base class
abstract class Shape {
    abstract void area();
}

// Triangle class
class Triangle extends Shape {
    void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

// Rectangle class
class Rectangle extends Shape {
    void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Experiment5_Area{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape;
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Area of Triangle");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    shape = new Triangle();
                    shape.area();
                    break;
                case 2:
                    shape = new Rectangle();
                    shape.area();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
