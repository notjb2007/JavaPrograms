public class StackTraceDemo {

    public static void main(String[] args) {
        try {
            startProcess();
        } catch (Exception e) {
            System.out.println("Exception caught in main()");
            e.printStackTrace();   // prints the stack trace
        }
    }

    static void startProcess() {
        processData();
    }

    static void processData() {
        executeTask();
    }

    static void executeTask() {
        String name = null;
        System.out.println(name.length()); // NullPointerException
    }
}
