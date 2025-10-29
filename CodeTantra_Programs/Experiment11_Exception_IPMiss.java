import java.util.*;

public class Experiment11_Exception_IPMiss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            long n = sc.nextLong();
            System.out.println(n);
        } catch (InputMismatchException e) {
            System.out.println("Error: enter a valid integer.");
        }
    }
}
