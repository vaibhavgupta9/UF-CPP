package q198_HouseRobber;

/**
 * Created by chris on 6/11/17.
 * Iterative solution, do not need extra space to store results. Just store the last two steps
 * O(n) time, O(1) space. bottom up dp
 */
public class ChrisDPIterSolution implements Solution {

    @Override
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int len = nums.length, mOne = 0, mTwo = 0, curr = 0;

        for (int i = 0; i < len; i++) {
            if (mOne + nums[i] > mTwo) {
                curr = mOne + nums[i];
                mOne = mTwo;
                mTwo = curr;
            } else {
                mOne = mTwo;
            }
        }

        return curr;
    }
}
