/**
 * Recursive Solution, O(N^2) time, O(N) space. This is the top down solution.
 *
 * For each move number, we reserve at least three steps: select, copy, paste.
 * And for the optimal result, we want to find somewhere P between [1,N], at optimal
 * position P (after P steps), we select, copy, then paste, paste... until used up
 * all steps. P must <= N-3 to guarantee there are 3 steps for the operation. Or the
 * only possible operation is press 'A'. Suppose P is the optimal point to do the
 * SCP (select, copy, paste), there are N-P steps remains. minus one step for select,
 * one step for copy, the length of the string we can get after P, is N - P - 1 - 1 copies of
 * the string at P steps. So the final length we can get is (N-P-1-1+1)*[string at P].
 * Starts from the N-3 step, we go way back to the first step, find the maximum length
 * we can get.
 */
public class Chris_DPRecursiveSolution implements Solution {
    @Override
    public int maxA(int N) {
        int[] mem = new int[N + 1];
        return maxStep(N, mem);
    }

    private int maxStep(int N, int[] mem) {
        if (N < 7) return N;
        if (mem[N] > 0) return mem[N];

        int max = 0;
        for (int i = N - 3; i >= 1; i--) {
            max = Math.max((N - i - 1) * maxStep(i, mem), max);
        }
        mem[N] = max;
        return mem[N];
    }
}
