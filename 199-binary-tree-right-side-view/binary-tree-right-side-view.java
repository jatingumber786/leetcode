class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root,0,list);
        return list;
    }
    private void helper(TreeNode root, int level,List<Integer> list){
        if(root==null) return;if(level==list.size()) list.add(root.val);
        helper(root.right,level+1,list);helper(root.left,level+1,list);
    }
}