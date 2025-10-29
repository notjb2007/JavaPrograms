import java.util.*;

public class Experiment13_VolCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double side = sc.nextDouble();
            if (side < 0) {
                throw new IllegalArgumentException();
            }
            double volume = side * side * side;
            System.out.println(volume);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Negative side length");
        }
    }
}
