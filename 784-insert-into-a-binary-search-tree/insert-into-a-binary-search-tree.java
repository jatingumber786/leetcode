class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newnode = new TreeNode(val);
        TreeNode node = root;
        if(node==null) return newnode;
        while(true){
            if(node.val<=val){
                if(node.right!=null){
                    node = node.right;
                }else{
                    node.right = newnode;
                    break;
                }
            }else{
                if(node.left!=null){
                    node = node.left;
                }else{
                    node.left = newnode;
                    break;
                }
            }
        }
        return root;
    }
}