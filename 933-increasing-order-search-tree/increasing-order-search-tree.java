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
    TreeNode node = null;
    TreeNode temp = null;

    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return node;
        
    }

    void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);

            if(temp == null){
                TreeNode nn = new TreeNode(root.val) ;
                temp = nn;
                node = nn;
            }
            else{
                TreeNode nn1 = new TreeNode(root.val);
                temp.right = nn1;
                temp = nn1;
            }


            inorder(root.right);
        }
    }
}