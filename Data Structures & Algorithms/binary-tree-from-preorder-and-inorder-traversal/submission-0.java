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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // start with base case (preorder/inorder is empty )
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }
      
        TreeNode root = new TreeNode(preorder[0]); // set root of tree to preorder at index 0 
         int mid = -1;
        for(int i = 0; i<inorder.length; i++){// finding where the root lies in the inorder array 
            if(inorder[i]== preorder[0]){
                mid = i; // getting index of root in inorder array 
                break;
            }
        

        }
        int[] leftPreorder = Arrays.copyOfRange(preorder,1,mid+1);// making a subarray for the left subtree copying values from preorder[1](left root) to the inder[mid] which is the last value in left subtree
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, mid); // creating subarray for the Left subtree copying values of inorder from 0 to mid
        root.left= buildTree(leftPreorder, leftInorder); //recursively call buildTree function using left preorder and inrder to build the left subtree 
        int[] rightPreorder = Arrays.copyOfRange(preorder,mid +1 ,preorder.length);
        int[] rightInorder = Arrays.copyOfRange(inorder, mid +1, inorder.length);
        root.right = buildTree(rightPreorder, rightInorder);
        return root;

    }

}
