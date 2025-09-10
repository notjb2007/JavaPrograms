public class gcd {
    
    // Recursive method to find GCD
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // base case
        }
        return gcd(b, a % b); // recursive case
    }

    public static void main(String[] args) {
        int num1 = 56, num2 = 98;
        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}
