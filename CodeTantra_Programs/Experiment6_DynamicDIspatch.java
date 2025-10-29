import java.util.Scanner;

// Parent class
class Rectangle2 {
    double length, width;

    void area() {
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();
        double area = length * width;
        System.out.println("Area of rectangle: " + area);
    }
}

// Child class
class Square extends Rectangle2 {
    double side;

    @Override
    void area() {
        Scanner sc = new Scanner(System.in);
        side = sc.nextDouble();
        double area = side * side;
        System.out.println("Area of square: " + area);
    }
}

// Child class
class Triangle2 extends Rectangle2 {
    double base, height;

    @Override
    void area() {
        Scanner sc = new Scanner(System.in);
        base = sc.nextDouble();
        height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of triangle: " + area);
    }
}

public class Experiment6_DynamicDIspatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Rectangle2 rect = new Rectangle2();
        Square sq = new Square();
        Triangle2 tri = new Triangle2();
        Rectangle2 ref;

        // Rectangle area
        // Prompt:
        // First the user enters length, then width (space/newline separated)
        ref = rect;
        ref.area();

        // Square area
        // Prompt:
        // The user enters side length of the square
        ref = sq;
        ref.area();

        // Triangle area
        // Prompt:
        // The user enters base and height (space/newline separated)
        ref = tri;
        ref.area();
    }
}
