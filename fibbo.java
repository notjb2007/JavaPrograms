public class fibbo {
    
    // Recursive method for Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // base case: fib(0)=0, fib(1)=1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // recursive case
    }

    public static void main(String[] args) {
        int n = 10; // print first 10 Fibonacci numbers
        System.out.println("Fibonacci series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
