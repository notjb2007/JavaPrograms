import java.math.*;

public class Box4 {
    double width, height, depth;
    Box4() { width = height = depth = -1; }
    Box4(double length) { width = height = depth = length; }
    Box4(double width, double height, double depth) {
        this.width = width; this.height = height; this.depth = depth;
    }
    public double volume() { return width * height * depth; }
    public static void main(String[] args) {
        Box4 b;
        if (args.length == 0) {
            b = new Box4();
            System.out.printf("Volume of Box() is : %.2f\n", b.volume());
        } else if (args.length == 1) {
            double len = Double.parseDouble(args[0]);
            b = new Box4(len);
            System.out.printf("Volume of Box(%.2f) is : %.2f\n", len, b.volume());
        } else if (args.length == 3) {
            double w = Double.parseDouble(args[0]);
            double h = Double.parseDouble(args[1]);
            double d = Double.parseDouble(args[2]);
            b = new Box4(w, h, d);
            System.out.printf("Volume of Box(%.2f, %.2f, %.2f) is : %.2f\n", w, h, d, b.volume());
        } else {
            System.out.printf("Volume of Box() is : %.2f\n", -1.00);
        }
    }
}
