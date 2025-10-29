public class Experiment3_Overload {

    // Method for adding two ints
    public int add(int a, int b) {
        return a + b;
    }

    // Method for adding int and float
    public float add(int a, float b) {
        return a + b;
    }

    // Method for adding two floats
    public float add(float a, float b) {
        return a + b;
    }

    // Method for adding two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method for adding float, double, double
    public double add(float a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Parsing command-line arguments
        int int1 = Integer.parseInt(args[0]);
        int int2 = Integer.parseInt(args[1]);
        float float1 = Float.parseFloat(args[2]);
        float float2 = Float.parseFloat(args[3]);
        double double1 = Double.parseDouble(args[4]);
        double double2 = Double.parseDouble(args[5]);

        Experiment3_Overload obj = new Experiment3_Overload();

        System.out.println("Sum of " + int1 + " and " + int2 + " : " + obj.add(int1, int2));
        System.out.println("Sum of " + float1 + " and " + float2 + " : " + obj.add(float1, float2));
        System.out.println("Sum of " + int2 + " and " + float2 + " : " + obj.add(int2, float2));
        System.out.println("Sum of " + float1 + ", " + double1 + " and " + double2 + " : " + obj.add(float1, double1, double2));
    }
}
