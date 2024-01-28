package Graphs.tree;

public class TwoMergeTreeSum {

    public TreeNode mergeTree(TreeNode root1, TreeNode root2){

        if(root1==null && root2==null){
            return null;
        }

        if(root1==null){
            return root2;
        }else if(root2==null){
            return root1;
        }
        TreeNode mergedRootSum= new TreeNode(root1.val+root2.val);
        mergedRootSum.left=mergeTree(root1.left,root2.left);
        mergedRootSum.right=mergeTree(root1.right,root2.right);
        return mergedRootSum;
    }
}
