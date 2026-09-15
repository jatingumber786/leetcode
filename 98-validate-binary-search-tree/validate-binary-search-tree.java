class Solution {
    public boolean isValidBST(TreeNode root) {
       // List<Integer> list = new ArrayList<>();
        return help(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }
    private boolean help(TreeNode root , long max, long min){
        if(root==null) return true;
        if(root.val>=max || root.val<=min) return false;
        return help(root.left,root.val,min) && help(root.right,max,root.val);
    }
}