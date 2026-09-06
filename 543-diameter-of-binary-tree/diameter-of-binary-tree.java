class Solution {
        int daimeter=0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return daimeter;
    }
    private int height(TreeNode root){
        if(root==null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        daimeter = Math.max(daimeter,lh+rh);
        return 1+Math.max(lh,rh);
    }
}