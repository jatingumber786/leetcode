class Solution {
    public boolean isSymmetric(TreeNode root) {
        return help(root.left,root.right);
    }
    private boolean help(TreeNode p ,TreeNode q){
        if(p==null || q==null) return p==q;
        return (p.val==q.val) && help(p.left,q.right) && help(p.right,q.left);
    }
}