class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - " + i);
            try {
                Thread.sleep(100); // Sleep for 100ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        // Start first thread
        t1.start();
        try {
            t1.join(); // Main thread waits for t1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start second thread
        t2.start();
        try {
            t2.join(); // Main thread waits for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start third thread
        t3.start();
        try {
            t3.join(); // Main thread waits for t3 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished.");
    }
}
