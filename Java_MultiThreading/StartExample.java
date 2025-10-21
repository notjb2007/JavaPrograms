class StartExample extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        StartExample t = new StartExample();
        t.start(); // starts the thread
    }
}
