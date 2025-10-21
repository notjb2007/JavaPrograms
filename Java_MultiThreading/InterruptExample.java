class InterruptExample extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }
    }

    public static void main(String[] args) {
        InterruptExample t = new InterruptExample();
        t.start();
        t.interrupt(); // interrupts the thread
    }
}
