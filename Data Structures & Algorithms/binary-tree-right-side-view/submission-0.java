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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null)
        return res;
        Queue<TreeNode> q=new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
        int size=q.size();
        for(int i=0;i<size-1;i++){
            TreeNode front=q.poll();
            if(front.left!=null)
            q.add(front.left);
            if(front.right!=null)
            q.add(front.right);
        }
        TreeNode sec=q.poll();
        res.add(sec.val);
        if(sec.left!=null)
        q.add(sec.left);
        if(sec.right!=null)
        q.add(sec.right);
       
       }
       return res;
    }
}
