class HealthChecker implements Runnable {
    @Override
    public void run() {
        // This is an infinite loop, but it won't stop the program from exiting.
        while (true) {
            System.out.println("Daemon Thread: System health is OK.");
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                // This exception is thrown if another thread interrupts this one.
            }
        }
    }
}

public class DaemonExample {
    public static void main(String[] args) {
        System.out.println("Main Thread: Starting the application.");

        Thread healthCheckThread = new Thread(new HealthChecker());

        // *** This is the crucial step ***
        // Mark this thread as a daemon thread. This must be done BEFORE starting it.
        healthCheckThread.setDaemon(true);
        healthCheckThread.start();

        System.out.println("Main Thread: Doing some primary work for 3 seconds.");
        try {
            // The main thread will "live" for 3 seconds.
            Thread.sleep(3100);
        } catch (InterruptedException e) {
            // handle exception
        }

        System.out.println("Main Thread: Finished. The application will now exit.");
    }
}