class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traverse(root,res);
        return res;

    }
    private void traverse(TreeNode root, List res){
        if(root==null) return;
        traverse(root.left,res);
        traverse(root.right,res);
        res.add(root.val);
    }
}