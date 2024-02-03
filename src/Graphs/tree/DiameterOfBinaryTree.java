package Graphs.tree;

public class DiameterOfBinaryTree {

    int maxDiameter=0;

    public int diameterOfBinaryTree(TreeNode root){

        return caluclateDepth(root);

    }
    private int caluclateDepth(TreeNode node){
        if(node==null){
            return 0;
        }
        int ledtdepth=caluclateDepth(node.left);
        int rightDepth=caluclateDepth(node.right);
        maxDiameter=Math.max(maxDiameter ,ledtdepth+rightDepth);
        return 1+Math.max(ledtdepth,rightDepth);
    }
    public static void main(String[] args) {

    }
}
