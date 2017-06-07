package q366_Fibonacci;

import java.util.HashMap;
import java.util.Map;

/**
 * DP with memoization will take O(n) space and O(n) time
 */
public class DPMemoSolution implements Solution {

    Map<Integer, Integer> map = new HashMap<>();

    @Override
    public int fibonacci(int n) {
        if (n < 1) throw new IllegalArgumentException("n must be greater than 0");
        if (n == 1) return 0;
        if (n == 2) return 1;
        // memoization table
        if (map.containsKey(n)) {
            return map.get(n);
        }

        int sum = fibonacci(n - 1) + fibonacci(n - 2);
        map.put(n, sum);
        return sum;
    }
}
