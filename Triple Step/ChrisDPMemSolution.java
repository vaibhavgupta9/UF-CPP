import java.util.HashMap;
import java.util.Map;

/**
 * O(n) time, O(n) space. The mem solution is a.k.a top-down DP
 */
public class ChrisDPMemSolution implements Solution {

    private static Map<Integer, Integer> mem = new HashMap<>();

    @Override
    public int countSteps(int n) {
//        return countStepsHelper(n);
        return countStepsHelperTwo(n);
    }

    /**
     * Helper one illustrates all the possible situations of basic states
     * (0,1,2,3 steps).
     */
    private int countStepsHelper(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else if (n == 2) return 2;
        else if (n == 3) return 4;
        else if (mem.containsKey(n)) return mem.get(n);
        else {
            mem.put(n, countStepsHelper(n - 3)
                    + countStepsHelper(n - 2)
                    + countStepsHelper(n - 1));

            return mem.get(n);
        }
    }

    /**
     * Helper Two consider n==0 has one solution, this will make the recursion
     * quite easy to maintain since it will take care less base cases (just n<0
     * and n==1). The only difference is the base case (n==0) will be different.
     */
    private int countStepsHelperTwo(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        else if (mem.containsKey(n)) return mem.get(n);
        else {
            mem.put(n, countStepsHelperTwo(n - 3)
                    + countStepsHelperTwo(n - 2)
                    + countStepsHelperTwo(n - 1));

            return mem.get(n);
        }
    }
}
