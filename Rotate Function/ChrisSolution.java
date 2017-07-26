/**
 * for Input A, B, C, D
 * Base = A + B + C + D
 * F(0) = 0*A + 1*B + 2*C + k*D
 * F(1) = 1*A + 2*B + k*C + 0*D
 * ...
 * F(k) = F(k-1) + Base + (len-1)Array[k], 0<k<n, len is the max num of k, which is n
 *
 * O(N) time, O(1) space
 */
public class ChrisSolution implements Solution {
    @Override
    public int maxRotateFunction(int[] A) {
        if (A == null || A.length == 0) return 0;
        int len = A.length, max = Integer.MIN_VALUE, base = 0;

        int fk, fkminusOne = 0;

        for (int i = 0; i < len; i++) {
            base += A[i];
            fkminusOne += i * A[i]; // init for F(0)
        }

        max = Math.max(fkminusOne, max);

        for (int k = 1; k < len; k++) {
            int idx = (len - k) % len;

            fk = fkminusOne + base - (len) * A[idx];
            fkminusOne = fk;
            max = Math.max(fk, max);
        }

        return max;
    }
}
