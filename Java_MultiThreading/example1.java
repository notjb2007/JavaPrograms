class MyThread extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
    }
}

public class example1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // This starts the new thread
    }
}