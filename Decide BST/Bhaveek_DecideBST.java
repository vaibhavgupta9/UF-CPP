/**
 * Created by bhaveekdesai on 6/2/17.
 * Time Complexity: O(log n) | Space Complexity: O(n log n) 
 */
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
   
    int lastVal = -1;

    boolean checkBST(Node root) {
        
        return bstTOal(root);
    }

    public boolean bstTOal(Node root){
        if(root != null){
            
            if (root.left != null) {
                if(!bstTOal(root.left)) return false;
            }
                      
            if (root.data<=lastVal) return false;
            else lastVal = root.data;
         
            if (root.right != null) {
                 if (!bstTOal(root.right)) return false;
            }
            
       }
        return true;
    }
}
