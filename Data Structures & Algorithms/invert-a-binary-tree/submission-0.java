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

class Solution { // DFS approach 
    public TreeNode invertTree(TreeNode root) {
       if(root == null) return null;
       
       TreeNode node = new TreeNode(root.val); // creating copy of root treenode called node, 

       node.right = invertTree(root.left);//editing the new treenode we created using the original tree node 
       node.left = invertTree(root.right); // 
        return node; 
    }
}
