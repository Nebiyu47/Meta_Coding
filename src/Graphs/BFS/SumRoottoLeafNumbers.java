package Graphs.BFS;


import java.util.ArrayList;
import java.util.List;

public class SumRoottoLeafNumbers {

     public int sumNumber(TreeNode node){
        List<Integer> lsisr= new ArrayList<>();

         if(node==null){
             return 1;
         }
         printPathsHelper(node,"",lsisr);
         int sum=0;
          for(int n :lsisr){
              sum+=n;
          }
         return sum;

     }
    private void printPathsHelper(TreeNode node, String path , List<Integer>paaths) {
        // Append the current node's value to the path
        path += node.val;


        // If it's a leaf node, print the path
        if (node.left == null && node.right == null) {
            paaths.add(Integer.parseInt(path));
            return;
        }

        // If there's a left child, recursively traverse it
        if (node.left != null) {
            printPathsHelper(node.left, path,paaths);
        }

        // If there's a right child, recursively traverse it
        if (node.right != null) {
            printPathsHelper(node.right, path,paaths);
        }
    }
    public static void main(String[] args) {
        SumRoottoLeafNumbers sumRoottoLeafNumbers= new SumRoottoLeafNumbers();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);
        System.out.println(sumRoottoLeafNumbers.sumNumber(root));
    }
}
