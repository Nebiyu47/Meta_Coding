package Graphs.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFTSTraversal {
    public static void bfsTraversal(TreeNode root){

        if(root==null){
            return ;

        }
        Queue<TreeNode> queen = new LinkedList<>();
        queen.offer(root);
        while(!queen.isEmpty()){
            TreeNode node= queen.poll();
            System.out.println(node.val + " ");
            if(node.left!=null){
                queen.offer(node.left);
            }if(node.right!=null){
                queen.offer(node.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right=new TreeNode(8);
        root.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);

        bfsTraversal(root);
    }
}
