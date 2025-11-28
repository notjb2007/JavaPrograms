class PrintStackTraceExample {
    public static void main(String[] args) {
        try {
            int x = 5 / 0;
        } catch (Exception e) {
            e.printStackTrace();  // prints complete stack trace
        }
    }
}
