public class FibonacciRecursion {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }
    public static void main(String[] args) {
        int n = 7; 
        int nthFibonacci = fibonacci(n);
        System.out.println(nthFibonacci);
    }
}
