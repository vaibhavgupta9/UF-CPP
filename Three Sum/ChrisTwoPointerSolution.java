import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * O(N^2) time, O(1) space
 */
public class ChrisTwoPointerSolution implements Solution {

    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        final int target = 0;
        final int len = nums.length;

        if (len < 3) return res;

        // The array has been sorted, so the loop does not need to go anymore if the first num
        // is greater than the sum
        for (int i = 0; i < len - 2 && nums[i] <= target; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip the duplicated answers

            int twoSum = target - nums[i];
            int lo = i + 1, hi = len - 1;
            int tmp2Sum;
            while (lo < hi) {
                tmp2Sum = nums[lo] + nums[hi];
                if (tmp2Sum == twoSum) {
                    res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    lo++;
                    hi--;
                    while (lo < hi && nums[lo] == nums[lo - 1]) lo++; // skip duplicated answers
                    while (lo < hi && nums[hi] == nums[hi + 1]) hi--; // skip duplicated answers
                } else if (tmp2Sum < twoSum) lo++;
                else if (tmp2Sum > twoSum) hi--;
            }
        }

        return res;
    }


}
