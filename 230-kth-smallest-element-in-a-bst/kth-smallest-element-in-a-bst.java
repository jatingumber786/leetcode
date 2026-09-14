class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> inorder = new ArrayList<>();
        help(inorder,k,root);   
        return inorder.get(k-1);  
    }
    private void  help(List<Integer> in , int k,TreeNode root){
        if(root==null) return;
        help(in,k,root.left);
        in.add(root.val);
        help(in,k,root.right);
    }
}