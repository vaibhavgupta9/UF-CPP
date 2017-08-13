/**
 * O(N^2) time, O(N) space. The principle behind this solution is same as the
 * recursive one. This is the iterative bottom up solution.
 */
public class Chris_DPIterativeSolution implements Solution {

    @Override
    public int maxA(int N) {
        int[] mem = new int[N + 1];
        if (N < 7) return N;

        for (int i = 1; i < 7; i++) mem[i] = i;
        for (int i = 7; i <= N; i++) {
            for (int j = i - 3; j >= 1; j--) {
                mem[i] = Math.max((i - j - 1) * mem[j], mem[i]);
            }
        }

        return mem[N];
    }
}
