class Circle {
    double x, y;
    double r;

    double circumference() {
        return 2 * Math.PI * r;  // Use Math.PI for better accuracy
    }

    double area() {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
		Circle c1 = new Circle();
		
        c.x = 3.0;
        c.y = 4.0;
        c.r = 5.0;
		
		c1.x = 5.0;
        c1.y = 3.0;
        c1.r = 4.0;
        System.out.println("Circumference: " + c.circumference());
        System.out.println("Area: " + c.area());
		
		System.out.println("Circumference: " + c1.circumference());
        System.out.println("Area: " + c1.area());
    }
}
