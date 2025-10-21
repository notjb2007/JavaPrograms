class CurrentExample {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t.getName());
        t.setName("MainThread");
        System.out.println("After rename: " + t.getName());
    }
}
