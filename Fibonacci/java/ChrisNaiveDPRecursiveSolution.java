package q366_Fibonacci;

/**
 * Recursive solution is intuitive. But it will cause severe call stack problem like
 * stack overflow and too deep call stack, which will lead to a overtime(timeout) problem.
 * O(2^N) time and O(1) space. The space is theoratical, does not count the stack call overhead
 */
public class NaiveDPRecursiveSolution implements Solution {
    @Override
    public int fibonacci(int n) {
        if (n < 1) throw new IllegalArgumentException("n must be greater than 0");
        if (n == 1) return 0;
        if (n == 2) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
