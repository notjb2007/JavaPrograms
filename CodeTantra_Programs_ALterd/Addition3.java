public class Addition3 {
    public void add(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " : " + (a + b));
    }
    public void add(float a, float b) {
        System.out.println("Sum of " + a + " and " + b + " : " + (a + b));
    }
    public void add(int a, float b) {
        System.out.println("Sum of " + a + " and " + b + " : " + (a + b));
    }
    public void add(float a, double b, double c) {
        System.out.println("Sum of " + a + ", " + b + " and " + c + " : " + (a + b + c));
    }
    public static void main(String[] args) {
        Addition obj = new Addition();
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        float f1 = Float.parseFloat(args[2]);
        float f2 = Float.parseFloat(args[3]);
        double d1 = Double.parseDouble(args[4]);
        double d2 = Double.parseDouble(args[5]);
        obj.add(i1, i2);
        obj.add(f1, f2);
        obj.add(i2, f2);
        obj.add(f1, d1, d2);
    }
}
