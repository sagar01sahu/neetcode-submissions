/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int leftheight(TreeNode root){
        if(root==null)
        return 0;
        return 1+Math.max(leftheight(root.left),leftheight(root.right));
        }
        
        public boolean helper(TreeNode root){
            if(root==null)
            return true;
            if(Math.abs(leftheight(root.left)-leftheight(root.right))>1){
                return false;
            }
            return helper(root.left)&& helper(root.right);
        }
    public boolean isBalanced(TreeNode root) {
        return helper(root);
    }
}
