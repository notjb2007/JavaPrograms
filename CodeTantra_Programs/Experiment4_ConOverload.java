public class Experiment4_ConOverload{
    double width, height, depth;

    // Default constructor
    public Experiment4_ConOverload() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    // Constructor with one parameter
    public Experiment4_ConOverload(double length) {
        this.width = length;
        this.height = length;
        this.depth = length;
    }

    // Constructor with three parameters
    public Experiment4_ConOverload(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Volume method
    public double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Experiment4_ConOverload box;
        StringBuilder argsStr = new StringBuilder();

        if (args.length == 0) {
            box = new Experiment4_ConOverload();
            System.out.printf("Volume of Box() is : %.2f\n", box.volume());
        } else if (args.length == 1) {
            double l = Double.parseDouble(args[0]);
            box = new Experiment4_ConOverload(l);
            System.out.printf("Volume of Box(%.2f) is : %.2f\n", l, box.volume());
        } else if (args.length == 3) {
            double w = Double.parseDouble(args[0]);
            double h = Double.parseDouble(args[1]);
            double d = Double.parseDouble(args[2]);
            box = new Experiment4_ConOverload(w, h, d);
            System.out.printf("Volume of Box(%.2f, %.2f, %.2f) is : %.2f\n", w, h, d, box.volume());
        } else {
            System.out.println("Invalid number of arguments.");
        }
    }
}
