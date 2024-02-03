package Arrays.vector.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        this.val = x;
    }
}

    class Solution{

        // Input:
        //          1
        //        /   \
        //       2     3
        //      / \   / \
        //     4   5 6   7
        //
        //Output:






        public  List<TreeNode> preOrderTraversal(TreeNode root){
            //Pre-order traversal: 1 2 4 5 3 6 7
           //Root, Left, Right

            List<TreeNode> result= new ArrayList<>();
            if(root==null){
                return result;
            }
            Stack<TreeNode> stack = new Stack<>();

            stack.push(root);

            while (!stack.isEmpty()){
                TreeNode node= stack.pop();
                result.add(node);

                if(node.right!=null){
                    stack.push(node.right);
                }if(node.left!=null){
                    stack.push(node.left);
                }
            }

            for(TreeNode b : result){
                System.out.println(b.val);
            }
            return result;
        }

        public List<TreeNode> Inordertraversal(TreeNode root){

            List<TreeNode> result= new ArrayList<>();

            if(root==null){
                return result;
            }
            Stack<TreeNode> stack= new Stack<>();
            TreeNode curr=root;
            while (curr!=null||stack.isEmpty()){
                while (curr!=null){
                    stack.push(curr);
                    curr=curr.left;
                }
                curr=stack.pop();
                result.add(curr);
                curr=curr.right;
            }
            return result;
}
  public List<TreeNode> Inordertraversal2(TreeNode root){    //In-order traversal: 4 2 5 1 6 3 7
            //Left, Root, Right
            // In post-order traversal, the algorithm visits the nodes
            // in the following order: left subtree, right subtree, root.
            List<TreeNode> result= new ArrayList<>();
            inOrderHelper(root,result);
            for (TreeNode node: result){
                System.out.println(node.val);
            }
            return result;
  }
  private void inOrderHelper(TreeNode root, List<TreeNode> result){
            if(root==null){
                return;
            }
            inOrderHelper(root.left,result);
            result.add(root);
            inOrderHelper(root.right,result);
  }

  private List<TreeNode> postOrderTraversal(TreeNode root){
            //Post-order traversal: 4 5 2 6 7 3 1
            //   Left, Right, Root
            List<TreeNode> result= new ArrayList<>();
            postOrderTraversalHelper(root,result);
            return result;

  }
  private void postOrderTraversalHelper(TreeNode node , List<TreeNode> result){
            if(node==null){
                return;
            }
            postOrderTraversalHelper(node.left,result);
            postOrderTraversalHelper(node.right,result);
            result.add(node);
  }

  public List<TreeNode> levelOrderTraversal(TreeNode root){
            //Level-order traversal: 1 2 3 4 5 6 7
           // Top to bottom, left to right on
            List<TreeNode> result= new ArrayList<>();
            int hegihts= getHeight(root);
            for(int i=1;i<=hegihts;i++){
                printGivenLevel(root,i,result);
            }
            return result;

  }
  private int getHeight(TreeNode root){
            if(root==null){
                return 0;
            }else {
                int leftHeight=getHeight(root.left);
                int rightHeight=getHeight(root.right);
                return Math.max(leftHeight,rightHeight)+1;
            }
  }
  public void printGivenLevel(TreeNode root, int level, List<TreeNode> list){
            if(root==null){
                return;
            }
            if(level==1){

                list.add(root);
            }else if(level>1){
                printGivenLevel(root.left,level-1,list);
                printGivenLevel(root.right,level-1,list);
            }
  }
  public List<TreeNode> reverseInOrderTraversal(TreeNode root){    //Reverse in-order traversal: 7 3 6 1 5 2 4
            List<TreeNode> result= new ArrayList<>();
            reverseInOrderHelper(root,result);
            return result;
  }
  public void reverseInOrderHelper(TreeNode root, List<TreeNode> result){
            if(root==null){
                return;
            }
            reverseInOrderHelper(root.right,result);
            result.add(root);
            reverseInOrderHelper(root.left,result);
  }
  public void printRootToLeafNumbers(TreeNode root){
            List<String> paths= new ArrayList<>();
            dfs(root,"",paths);

  }
  private void dfs(TreeNode node ,String path, List<String> paths){
            if(node==null){
                return;
            }
            path+=node.val;
            if(node.left==null&&node.right==null){
                paths.add(path);
                return;
            }
            dfs(node.left,path,paths);
            dfs(node.right,path,paths);
  }


    public static void main(String[] args) {
        Solution solution= new Solution();

        TreeNode node= new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        node.left.left=new TreeNode(4);
        node.left.right= new TreeNode(5);
        node.right.left=new TreeNode(6);
        node.right.right=new TreeNode(7);

        solution.preOrderTraversal(node);

    }
}
