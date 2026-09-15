class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode node = root;
        if(node == null) return null;
        if(node.val==key) return help(root);
        while(node!=null){
            if(node.val>key){
                if(node.left!=null && node.left.val==key){
                    node.left = help(node.left);
                }else{
                    node = node.left;
                }
            }else{
                if(node.right!=null && node.right.val==key){
                    node.right = help(node.right);
                }else{
                    node = node.right;
                }
            }
        }
        return root; 
    }
    private TreeNode help(TreeNode root){
        //TreeNode node = root;
        if(root.left==null) return root.right;
        else if(root.right==null) return root.left;
        TreeNode rightchild = root.right;
        TreeNode lastchild = findlastright(root.left);
        lastchild.right = rightchild;
        return root.left;
    }
    private TreeNode findlastright(TreeNode root){
        if(root.right==null) return root;
        return findlastright(root.right);
    }
}