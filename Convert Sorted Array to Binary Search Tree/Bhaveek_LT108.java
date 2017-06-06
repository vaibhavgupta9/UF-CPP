/**
 * Created by bhaveekdesai on 6/2/17.
 */
public class Bhaveek_LT108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        int min = 0;
        int max = nums.length - 1;
        TreeNode root = createBalancedBST(nums, min, max);

        return root;
    }

    public TreeNode createBalancedBST(int[] nums, int min, int max) {
        if (min>max) {
            return null;
        }

        int mid = (min+max)/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = createBalancedBST(nums, min, mid-1);
        root.right = createBalancedBST(nums, mid+1, max);

        return root;
    }
}
