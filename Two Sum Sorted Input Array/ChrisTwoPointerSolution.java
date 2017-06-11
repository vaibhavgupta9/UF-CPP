/**
 * Created by chris on 5/9/17.
 *
 * O(N) time, O(1) space
 */
public class ChrisTwoPointerSolution implements Solution {

    @Override
    public int[] twoSum(int[] numbers, int target) {
        int lo = 0, hi = numbers.length-1;

        int sum;
        while (lo < hi) {
            sum = numbers[lo] + numbers[hi];
            if (sum == target) return new int[]{lo + 1, hi + 1};
            else if (sum < target) lo++;
            else if (sum > target) hi--;
        }

        throw new IllegalArgumentException("invalid Input");
    }
}
