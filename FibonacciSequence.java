public class FibonacciSequence {

    // Recursive method to calculate the nth term in the Fibonacci sequence
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Main method to execute and output the 10th term
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);

        // Output the result with descriptive text
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
