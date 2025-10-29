import java.util.Scanner;

class Rectangle2 {
    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of Rectangle");
        int length = sc.nextInt();
        int width = sc.nextInt();
        int area = length * width;
        System.out.println("Area of rectangle: " + area);
    }
}

class Square extends Rectangle2 {
    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of square: " + area);
    }
}

class Triangle2 extends Rectangle2 {
    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of Traingle");
        int base = sc.nextInt();
        int height = sc.nextInt();
        int area = (base * height) / 2;
        System.out.println("Area of triangle: " + area);
    }
}

public class Calculation6 {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2();
        r.area();
        r = new Square();
        r.area();
        r = new Triangle2();
        r.area();
    }
}
