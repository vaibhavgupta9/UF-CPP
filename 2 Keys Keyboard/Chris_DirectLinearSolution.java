public class Chris_DirectLinearSolution implements Solution {
    /**
     * The purpose is to find all factors except 1 and the number it self. For each
     * factor, copy will take one step, then paste factor-1 times (because there is
     * already an original copy there). For any number combination, it will not use
     * less than the factors combination steps. So the minimum steps is the sum of
     * all factors.
     */
    @Override
    public int minSteps(int n) {

        int steps = 0;

        for (int factor = 2; n != 1; factor++) {
            while (n % factor == 0) {
                steps += factor;
                n /= factor;
            }
        }

        return steps;
    }
}
