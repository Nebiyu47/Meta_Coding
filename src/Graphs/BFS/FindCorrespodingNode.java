package Graphs.BFS;

public class FindCorrespodingNode {
    public TreeNode getTargetCopy(TreeNode original, TreeNode cloned, TreeNode target) {


        if (original == null) {
            return null;
        }
        TreeNode leftResult = getTargetCopy(original.left, cloned.left, target);
        if (leftResult != null) {
            return leftResult;
        }
        TreeNode rightResult = getTargetCopy(original.right, cloned.right, target);
        if (rightResult != null) {


            return rightResult;
        }
        return null;
    }
}