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
    public boolean isBalanced(TreeNode root) {
        return find(root) ==-1?false:true;

    }

    static int find(TreeNode root){
        if(root==null) return 0;

        int lf_h=find(root.left);
        int ri_h=find(root.right);

        if(lf_h==-1 || ri_h==-1) return -1;

        if(Math.abs(lf_h-ri_h) > 1) return -1;

        return Math.max(lf_h,ri_h)+1;
    }
}
