class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightview(root,list,0);
        return list;
    }
    private void rightview(TreeNode root,List<Integer> list,int currlevel){
        if(root==null) return;
        if(currlevel==list.size())  list.add(root.val);
        rightview(root.right,list,currlevel+1);
        rightview(root.left,list,currlevel+1);

    }
}