package Graphs.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class RootEqualsSumofChildren {

    public  static boolean  isRootEqualSum(TreeNode root){

        if(root==null){
            return true;
        }
        return isHelperEqual(root);

    }
    private static boolean isHelperEqual(TreeNode node){
        if(node.left==null&&node.right==null){
            return false;
        }
        int leftsum= node.left !=null ? node.left.val: 0 ;
        int rightSum= node.right != null ? node.right.val :  0 ;


        return (node.val==leftsum+rightSum) &&isHelperEqual(node.left) && isHelperEqual(node.right);
    }

    public static void main(String[] args) {
        RootEqualsSumofChildren solution = new RootEqualsSumofChildren();

        // Example tree:          10
        //                      /    \
        //                    4       6
        //                  /  \     / \
        //                 1    3   3   3
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(3);

        System.out.println(solution.isHelperEqual(root));
    }
}
