// Method 1: Extending the Thread class
class NumberPrinter extends Thread {
    // The code inside the run() method will be executed by this new thread.
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("NumberPrinter Thread: " + i);
            try {
                // Pausing for a short time to make the interleaving of threads more obvious.
                Thread.sleep(500); // 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("NumberPrinter was interrupted.");
            }
        }
        System.out.println("### NumberPrinter Thread has finished. ###");
    }
}

// Method 2 (Preferred): Implementing the Runnable interface
class LetterPrinter implements Runnable {
    // The code inside the run() method will be executed by this new thread.
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("LetterPrinter Thread: " + c);
            try {
                // Pausing for a short time.
                Thread.sleep(500); // 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("LetterPrinter was interrupted.");
            }
        }
        System.out.println("### LetterPrinter Thread has finished. ###");
    }
}

public class Main {
    public static void main(String[] args) {
        // This is the main thread.
        System.out.println("--- Main Thread started. ---");

        // Create an object of the class that extends Thread.
        NumberPrinter numberThread = new NumberPrinter();

        // Create an object of the class that implements Runnable.
        LetterPrinter letterRunnable = new LetterPrinter();
        // To run a Runnable, you must pass it to a Thread object's constructor.
        Thread letterThread = new Thread(letterRunnable);

        // Start the new threads. This tells the JVM to call the run() method of each.
        // The order of execution is NOT guaranteed.
        numberThread.start();
        letterThread.start();

        // The main thread continues its own work while the other threads are running.
        for (int i = 0; i < 3; i++) {
            System.out.println("Main Thread is doing its own work...");
            try {
                Thread.sleep(1000); // 1 second
            } catch (InterruptedException e) {
                System.out.println("Main thread was interrupted.");
            }
        }

        System.out.println("--- Main Thread finished. ---");
    }
}