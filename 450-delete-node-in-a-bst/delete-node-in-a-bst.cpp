class Solution {
public:
    TreeNode* deleteNode(TreeNode* root, int key) {
        if(root==NULL) return NULL;
        if(root->val==key) return help(root);
        TreeNode* node = root;
        while(root!=NULL){
            if(root->val>key ){
                if(root->left!=NULL && root->left->val==key){
                    root->left = help(root->left);
                    break;
                }else{
                    root = root->left;
                }
            }else{
                if(root->right!=NULL && root->right->val==key){
                    root->right = help(root->right);
                    break;
                }else{
                    root =root->right;
                }
            }
        }
        return node;
    }
    TreeNode* help(TreeNode* root){
        if(root->left==NULL) return root->right;
        else if(root->right==NULL) return root->left;
        TreeNode* rightchild = root->right;
        TreeNode* lastright = findlastright(root->left);
        lastright->right = rightchild;
        return root->left;
    }
    TreeNode* findlastright(TreeNode* root){
        if(root->right==NULL) return root;
        return findlastright(root->right);
    }
};