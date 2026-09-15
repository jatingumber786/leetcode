class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode node = root;
        if(root==null) return null;
        if(root.val==key) return help(root);
        while(node!=null){
            if(node.val>key){
                if(node.left!=null && node.left.val == key){
                    node.left =  help(node.left);
                    break;
                }else{
                    node = node.left;
                }
            }else{
                if(node.right!=null && node.right.val==key){
                    node.right = help(node.right);
                    break;
                }else{
                    node = node.right;
                }
            }
        }
        return root;
    }
    public TreeNode help(TreeNode root){
        if(root.left==null) return root.right;
        else if(root.right==null) return root.left;
        TreeNode rightchild = root.right;
        TreeNode lastchild = findlastchild(root.left);
        lastchild.right = rightchild;
        return root.left;
    }
    public TreeNode findlastchild(TreeNode root){
        if(root.right==null) return root;
        return findlastchild(root.right);
    }
}