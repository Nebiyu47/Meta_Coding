package Graphs.tree;

public class ClosestBinarySearchTreeValue {
    public int closestValue(TreeNode root ,double target){
        if(root==null){
            return -1;
        }
        int roundUp = (int) Math.ceil(target);
        return closestValue(root,roundUp);





    }
    public int closestValue(TreeNode node , int target){

        if(node.left==null||node.right==null &&node.val==target){
            return target;
        }
        int result= -1;

        if(node.left!=null){
            closestValue(node.left,target-node.val);
        }
        if(node.right!=null){
            closestValue(node.right,target-node.val);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        ClosestBinarySearchTreeValue closestBinarySearchTreeValue= new ClosestBinarySearchTreeValue();
        closestBinarySearchTreeValue.closestValue(root,22.3);
    }
}
