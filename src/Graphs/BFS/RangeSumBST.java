package Graphs.BFS;

 class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}

public class RangeSumBST {

    public int rangeSum(TreeNode root, int low, int high){
        if(root==null){
            return 0;

        }
        int sum=0;
        if(root.val>=low&&root.val<=high){
            sum+=root.val;
        }if(root.val>low){
            sum+=rangeSum(root.left,low,high);
        }if(root.val<high){
            sum+=rangeSum(root.right,low,high);
        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(10);
        treeNode.left=new TreeNode(5);
        treeNode.right= new TreeNode(15);
        treeNode.left.left= new TreeNode(3);
        treeNode.left.right= new TreeNode(7);
        treeNode.right.right= new TreeNode(18);

        RangeSumBST rangeSumBST= new RangeSumBST();
        int low =7;
        int right=15;
        int sum = rangeSumBST.rangeSum(treeNode,low,right);
        System.out.println(sum);
    }
}
