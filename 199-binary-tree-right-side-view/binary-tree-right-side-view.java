class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightview(root,0,list);
        return list;
    }
    private void rightview(TreeNode root,int currlevel,List<Integer> list){
        if(root==null) return;
        if(currlevel==list.size()) list.add(root.val);
        rightview(root.right,currlevel+1,list);
        rightview(root.left,currlevel+1,list);
    }
}