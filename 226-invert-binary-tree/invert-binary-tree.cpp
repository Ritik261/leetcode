/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* invertTree(TreeNode* root) {
        invertNode(root);
        return root;
        
    }
    void invertNode(TreeNode * p){
        if(p == NULL){
            return;
        }
        TreeNode *temp = p->left;
        p->left = p->right;
        p->right = temp;
        invertNode(p->left);
        invertNode(p->right);
    }
};