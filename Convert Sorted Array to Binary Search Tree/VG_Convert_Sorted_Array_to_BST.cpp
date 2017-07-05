/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    
    TreeNode* findNext(vector<int> nums, int start, int end)
    {   
        if(start>=end)
            return NULL;            
            
        int mid=(start+end)/2;
        
        TreeNode *root=new TreeNode(nums[mid]);
        
        root->left=findNext(nums, start, mid);
        root->right=findNext(nums, mid+1, end);
        
        return root;
    }
        
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        
        if(nums.empty())
            return NULL;        
        
        TreeNode *root=findNext(nums, 0, nums.size());
        return root;
    }
};