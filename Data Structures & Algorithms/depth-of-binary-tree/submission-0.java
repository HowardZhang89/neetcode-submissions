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
    public int maxDepth(TreeNode root) {
        return maxDepthHelper(root, 0);
    }

    private int maxDepthHelper(TreeNode root, int max){
        if(root == null) return max;
        int leftMax = maxDepthHelper(root.left, max+1);
        int rightMax = maxDepthHelper(root.right, max+1);
        return Math.max(leftMax, rightMax);
    }
}
