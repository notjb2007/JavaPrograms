class AliveExample extends Thread {
    public void run() {
        System.out.println("Thread running...");
    }

    public static void main(String[] args) throws InterruptedException {
        AliveExample t = new AliveExample();
        System.out.println("Before start: " + t.isAlive());
        t.start();
        System.out.println("After start: " + t.isAlive());
        t.join();
        System.out.println("After join: " + t.isAlive());
    }
}
