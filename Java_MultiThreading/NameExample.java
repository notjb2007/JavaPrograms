class NameExample extends Thread {
    public void run() {
        System.out.println("Running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        NameExample t1 = new NameExample();
        NameExample t2 = new NameExample();

        t1.setName("Alpha");
        t2.setName("Beta");

        t1.start();
        t2.start();

        System.out.println("Thread 1: " + t1.getName());
        System.out.println("Thread 2: " + t2.getName());
    }
}
