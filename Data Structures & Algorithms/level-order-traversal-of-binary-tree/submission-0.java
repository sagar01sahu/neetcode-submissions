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
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
        return res;
        Queue<TreeNode> q=new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
        int size=q.size();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode front=q.poll();
            l.add(front.val);
            if(front.left!=null)
            q.add(front.left);
            if(front.right!=null)
            q.add(front.right);
        }
        res.add(new ArrayList<>(l));
       }
       return res;
        
    }
}
