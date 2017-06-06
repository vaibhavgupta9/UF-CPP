/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.ArrayList;

public class Bhaveek_DecideBST {
     ArrayList<Integer> bstArrayList = new ArrayList();

    public int[] findMode(TreeNode root) {
        //inorder insertion
        bstToArray(root);

        if (bstArrayList.size() == 0){
            return new int[]{};
        }
        int maxCount = 1;
        int count = 1;

        ArrayList<Integer> modesArrayList = new ArrayList<Integer>();

        modesArrayList.add(bstArrayList.get(0));

        for (int i = 1; i<bstArrayList.size(); i++){
            int current = bstArrayList.get(i);
            int prev = bstArrayList.get(i-1);

            if (current == prev) {
                count++;
            } else {
                count = 1;
            }

            if (count == maxCount){
                modesArrayList.add(current);
            } else if (count>maxCount){
                maxCount = count;
                modesArrayList.clear();
                modesArrayList.add(current);
            }
        }

        int[] modes = new int[modesArrayList.size()];
        for (int i = 0; i<modes.length; i++) {
            modes[i] = modesArrayList.get(i);
        }

        return modes;
    }

    public void bstToArray(TreeNode node) {
        if (node != null) {
           if (node.left != null) {
                bstToArray(node.left);
            }
            bstArrayList.add(node.val);
            if (node.right != null) {
                bstToArray(node.right);
            }
        }
    }   
}
