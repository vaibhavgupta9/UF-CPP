/**
 * Optimal solution, O(logN) time, O(1) space.
 */
public class ChrisTwoPointerBSSolution implements Solution {
    @Override
    public int[] twoSum(int[] numbers, int target) {

        int lo = 0, hi = numbers.length - 1;
        int val;
        while (lo < hi) {
            val = numbers[lo] + numbers[hi];
            if (val == target) return new int[]{lo + 1, hi + 1};
            else if (val < target) {
//                lo to mid
                int res = target - numbers[hi];
                //move until lower >= res
                int right = hi;
                while (lo <= right) {
                    int mid = (lo + right) / 2;
                    if (numbers[mid] < res) {
                        lo = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }

            } else {
                // val > target, move until higher <=res
                // hi to mid
                int res = target - numbers[lo];
                int left = lo;
                while (left <= hi) {
                    int mid = (left + hi) / 2;
                    if (numbers[mid] > res) {
                        hi = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
            }


        }

        throw new IllegalArgumentException();
    }
}
