import java.util.ArrayList;
import java.util.Scanner;

public class SimpleThreads2 {

    // GLOBAL list so every thread can use it
    static ArrayList<Integer> numbers = new ArrayList<>();

    // Thread to print even numbers
    static class EvenThread extends Thread {
        public void run() {
            System.out.print("Even numbers: ");
            for (int n : numbers) {
                if (n % 2 == 0) {
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }
    }

    // Thread to print odd numbers
    static class OddThread extends Thread {
        public void run() {
            System.out.print("Odd numbers: ");
            for (int n : numbers) {
                if (n % 2 != 0) {
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }
    }

    // Thread to compute average
    static class AverageThread extends Thread {
        public void run() {
            double sum = 0;
            for (int n : numbers) {
                sum += n;
            }
            double avg = sum / numbers.size();
            System.out.println("Average: " + avg);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        // create threads
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();
        AverageThread t3 = new AverageThread();

        // start them
        t1.start();
        t2.start();
        t3.start();
    }
}
