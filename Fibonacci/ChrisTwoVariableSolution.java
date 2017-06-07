/**
 * Using two variable iteration to avoid recursion and stack overflow problem.
 * O(n) time and O(1) space
 */
public class TwoVariableSolution implements Solution {

    @Override
    public int fibonacci(int n) {
        if (n < 1) throw new IllegalArgumentException("n must be greater than 0");
        int num1 = 0, num2 = 1;

        for (int i = 0; i < n - 1; i++) {
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        return num1;
    }
}
