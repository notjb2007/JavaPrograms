class RunExample extends Thread {
    public void run() {
        System.out.println("Inside run() method");
    }

    public static void main(String[] args) {
        RunExample t = new RunExample();
        t.start(); // this calls run()
        System.out.println(t.getName());
    }
}
