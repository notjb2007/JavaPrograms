class SleepExample extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        new SleepExample().start();
    }
}
