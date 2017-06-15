package q198_HouseRobber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chris on 6/11/17.
 * O(n) time, O(n) space. Top down DP
 */
public class ChrisDPMemSolution implements Solution {

    private Map<Integer, Integer> mem = new HashMap<>();
    private int[] nums;

    @Override
    public int rob(int[] nums) {
        if (nums == null)
            return 0;
        this.nums = nums;

        return robHelper(nums.length);
    }

    private int robHelper(int n) {
        if (n == 0) return 0;
        else if (n == 1) return nums[0];
        else if (n == 2) return Math.max(nums[0], nums[1]);
        else if (mem.containsKey(n)) return mem.get(n);
        else {
            mem.put(n, Math.max(nums[n - 1] + robHelper(n - 2), robHelper(n - 1))); //nums[n-1] is the nth number
        }

        return mem.get(n);
    }
}
