class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode node = root;//eh mai aape chalaya bina code dekhe 
        //yes jatin u can do it,,,......
        if(node==null) return null;
        if(val>node.val){ 
            //if(node.val==val) return root;
            return searchBST(node.right,val);
            
        }else if(val<node.val){
           
            return searchBST(node.left,val);   
        }else{
             return root;
        }
        //return  null;
    }
}