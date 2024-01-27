package Graphs.tree;

public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }
    public void insert(int val){
        root = insertRec(root,val);
    }
    private TreeNode insertRec(TreeNode root, int val){
        if(root==null){
            root=new TreeNode(val);
          return root;
        }
        if(val< root.val){
            root.left=insertRec(root.left,val);
        }
        else if(val> root.val){
            root.right=insertRec(root.right,val);
        }
        return root;

    }
    public  int findMin(){
        if(root==null){
            throw new IllegalArgumentException("BST is empty");
        }
        TreeNode current= root;
        while(current.left!=null){
            current=current.left;
        }
        return current.val;
    }
    public void inOrderTraversal(TreeNode root){
        if(root!=null){
            inOrderTraversal(root.left);
            System.out.println(root.val);
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);


        System.out.println(bst.findMin());
    }
}
