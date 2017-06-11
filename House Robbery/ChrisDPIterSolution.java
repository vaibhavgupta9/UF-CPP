package q198_HouseRobber;

/**
 * Created by chris on 6/11/17.
 * Iterative solution, do not need extra space to store results. Just store the last two steps
 * O(n) time, O(1) space.
 */
public class ChrisDPIterSolution implements Solution {

    @Override
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int len = nums.length, firstVal = 0, secondVal = 0, max = 0;

        if (len > 0) {
            firstVal = nums[0];
            max = firstVal;
        }
        if (len > 1) {
            max = Math.max(firstVal, nums[1]);
            secondVal = max;
        }

        for (int i = 2; i < len; i++) {
            if (firstVal + nums[i] > secondVal) {
                max = firstVal + nums[i];
                firstVal = secondVal;
                secondVal = max;
            } else {
                firstVal = secondVal;
            }
        }

        return max;
    }
}
