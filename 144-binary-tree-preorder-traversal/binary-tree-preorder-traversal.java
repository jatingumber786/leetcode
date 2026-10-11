class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root==null) return list;
        st.push(root);
        //list.add(root.val);
        while(!st.isEmpty()){
           root = st.pop();
           list.add(root.val);
           if(root.right!=null) st.push(root.right);
           if(root.left!=null) st.push(root.left);
           
        }
        return list;
    }
}