package Graphs.tree;


class TreeNode{
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x){
       val=x;
   }
}
public class DFSquestions {

     public static void PreOrderTraversal(TreeNode root){
         if(root==null){
             return;
         }
         System.out.println(root.val);
         PreOrderTraversal(root.left);
         PreOrderTraversal(root.right);
     }

    public static void main(String[] args) {

         TreeNode treeNode = new TreeNode(10);
         treeNode.left = new TreeNode(1);
         treeNode.right= new TreeNode(2);
         treeNode.right.left= new TreeNode(3);
         treeNode.left.right= new TreeNode(4);

        PreOrderTraversal(treeNode);
    }

}
