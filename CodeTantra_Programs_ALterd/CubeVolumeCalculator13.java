import java.util.Scanner;

public class CubeVolumeCalculator13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double sl = sc.nextDouble();
            if (sl < 0)
                throw new IllegalArgumentException("Negative side length");
            double v = sl * sl * sl;
            System.out.println(v);
        } catch (Exception e) {
            System.out.println("Error: Negative side length");
        }
    }
}
