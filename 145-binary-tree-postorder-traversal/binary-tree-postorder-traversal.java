class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root,list);
        return list;
    }
    private void helper(TreeNode root, List<Integer> list){
        if(root==null) return;
        helper(root.left,list);
        helper(root.right,list);
        list.add(root.val);
    }
}