class StackTrace1 {

    static int divide(int a, int b) {
        return a / b;   // this will cause ArithmeticException
    }

    static void calculate() {
        divide(10, 0);  // calling divide()
    }

    public static void main(String[] args) {
        calculate();    // calling calculate()
    }
}
