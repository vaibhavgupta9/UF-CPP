package q198_HouseRobber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chris on 6/11/17.
 * O(n) time, O(n) space
 */
public class ChrisDPMemSolution implements Solution {

    @Override
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int len = nums.length;
        List<Integer> mem = new ArrayList<>(len);

        if (len > 0) mem.add(0, nums[0]);
        if (len > 1) mem.add(1, Math.max(nums[0], nums[1]));

        for (int i = 2; i < len; i++) {
            mem.add(i, Math.max(nums[i] + mem.get(i - 2), mem.get(i - 1)));
        }

        return mem.get(len - 1);
    }
}
