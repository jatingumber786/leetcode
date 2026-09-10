class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null || help(root.left,root.right);
    }
    private boolean help(TreeNode left , TreeNode right){
        if(left==null || right==null) return left==right;
        if(left.val!=right.val) return false;
        return help(left.left,right.right) && help(left.right,right.left);
    }
}