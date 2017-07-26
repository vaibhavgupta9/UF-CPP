import java.util.ArrayList;
import java.util.List;

public class Chris_DFSRecursiveSolution {

    List<List<Integer>> res;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        res = new ArrayList<>();
        dfs(new ArrayList<>(), root, sum);
        return res;
    }

    public void dfs(ArrayList<Integer> path, TreeNode node, int target) {
        if (node == null) return;
        target -= node.val;
        path.add(node.val);
        if (node.left == null && node.right == null) {
            if (target == 0) {
                res.add(new ArrayList<>(path));
            }
            return;
        }

        dfs(path, node.left, target);
        if (node.left != null)
            path.remove(path.size() - 1);
        dfs(path, node.right, target);
        if (node.right != null)
            path.remove(path.size() - 1);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
