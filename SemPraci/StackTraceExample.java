public class StackTraceExample {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Exception caught in main()");
            e.printStackTrace();   // prints the full stack trace
        }
    }

    static void method1() {
        method2();
    }

    static void method2() {
        method3();
    }

    static void method3() {
        int a = 10;
        int b = 0;
        int c = a / b;   // causes ArithmeticException
        System.out.println(c);
    }
}
