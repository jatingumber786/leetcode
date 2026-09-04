class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        h(inorder,root);
        return inorder;
    }
    private void h(List<Integer> l,TreeNode root){
        if(root==null) return;
        h(l,root.left);
        l.add(root.val);
        h(l,root.right);
    }
}