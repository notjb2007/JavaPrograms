class Circle {
    double x, y;
    double r;

    double circumference() {
        return 2 * Math.PI * r;
    }

    double area() {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        // Create first Circle object
        Circle c1 = new Circle();
        c1.x = 0;
        c1.y = 0;
        c1.r = 3.0;

        Circle c2 = new Circle();
        c2.x = 1;
        c2.y = 1;
        c2.r = 5.0;

        Circle c3 = new Circle();
        c3.x = -2;
        c3.y = -1;
        c3.r = 2.5;

        System.out.println("Circle 1: Area = " + c1.area() + ", Circumference = " + c1.circumference());
        System.out.println("Circle 2: Area = " + c2.area() + ", Circumference = " + c2.circumference());
        System.out.println("Circle 3: Area = " + c3.area() + ", Circumference = " + c3.circumference());
    }
}
