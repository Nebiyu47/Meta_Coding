package Graphs.tree;

import java.util.ArrayList;
import java.util.List;

public class TwoMergeTree {

    public TreeNode MergeTreeNode(TreeNode node, TreeNode node2) {

        List<Integer> list = new ArrayList<>();
        inOrderTraver(node, list);
        inOrderTraver(node2, list);

        list.sort(null);

         return constructNode(list , 0,list.size()-1);
    }

    public void inOrderTraver(TreeNode root, List<Integer> list) {

        if (root == null) {
            return;
        }
        inOrderTraver(root.left, list);
        list.add(root.val);
        inOrderTraver(root.right, list);

    }

    private TreeNode constructNode(List<Integer> elements, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(elements.get(mid));
        node.left = constructNode(elements, start , mid - 1);
        node.right = constructNode(elements, mid + 1, end);
        return node;
    }


    public static void main(String[] args) {
       TwoMergeTree twoMergeTree= new TwoMergeTree();
        TreeNode node= new TreeNode(2);
        node.left=new TreeNode(1);
        node.right= new TreeNode(4);
        TreeNode node1 = new TreeNode(3);
        node1.left= new TreeNode(5);
        node1.right=new TreeNode(6);


        System.out.println(twoMergeTree.MergeTreeNode(node, node1));

    }

}
