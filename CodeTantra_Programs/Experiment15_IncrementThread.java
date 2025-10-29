import java.util.*;

public class Experiment15_IncrementThread {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine().trim());
            int i = Integer.parseInt(sc.nextLine().trim());
            if (n < 0 || n > 10 || i < 0 || i > 10) {
                return;
            }
            Thread[] threads = new Thread[n];
            for (int t = 0; t < n; t++) {
                threads[t] = new Thread(() -> {
                    for (int k = 0; k < i; k++) {
                        count++;
                        System.out.println("Count : " + count);
                    }
                });
                threads[t].start();
            }
            // Wait for all threads to finish
            for (int t = 0; t < n; t++) {
                threads[t].join();
            }
        } catch (Exception e) {
            // Handle all exceptions silently (for test-case output format)
        }
    }
}
