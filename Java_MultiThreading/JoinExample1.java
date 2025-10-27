class JOIN extends Thread {
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Running");
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - " + i);
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Dead");
    }
}

public class JoinExample1 {
    public static void main(String[] args) throws InterruptedException {
        JOIN t1 = new JOIN();
        JOIN t2 = new JOIN();
        JOIN t3 = new JOIN();
        
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        t1.join(); // main thread waits for t1 to finish

        t2.start();
        t2.join(); // main thread waits for t2 to finish

        t3.start();
    }
}
