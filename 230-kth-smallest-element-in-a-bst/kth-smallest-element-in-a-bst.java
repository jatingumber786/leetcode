class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> pre = new ArrayList<>();
         help(pre,root);
         return pre.get(k-1);

    }
    private void  help(List<Integer> list , TreeNode root){

        if(root==null) return;
        
        ////if(count==k) return root.val;
        
        help(list,root.left);
        list.add(root.val);
        help(list,root.right);
        //return -1;
    }
}