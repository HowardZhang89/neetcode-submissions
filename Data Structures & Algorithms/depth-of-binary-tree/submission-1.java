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
        max++;
        int leftMax = maxDepthHelper(root.left, max);
        int rightMax = maxDepthHelper(root.right, max);
        return Math.max(leftMax, rightMax);
    }
}
