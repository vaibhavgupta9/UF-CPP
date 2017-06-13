/**
 * Created by chris on 6/12/17.
 * O(n) time, O(1) space. A.k.a bottom up DP.
 */
public class ChrisDPIterSolution implements Solution {
    @Override
    public int countSteps(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else if (n == 2) return 2;
        else if (n == 3) return 4;
        int mOneStep = 1, mTwoStep = 2, mThreeStep = 4, curStep = 0;

        for (int i = 4; i < n + 1; i++) {
            curStep = mOneStep + mTwoStep + mThreeStep;
            mOneStep = mTwoStep;
            mTwoStep = mThreeStep;
            mThreeStep = curStep;
        }

        return curStep;
    }
}
