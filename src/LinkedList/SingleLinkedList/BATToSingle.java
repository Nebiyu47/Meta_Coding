package LinkedList.SingleLinkedList;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        left=null;
        right=null;

    }
}
public class BATToSingle {

  TreeNode head;
  TreeNode prev;

  public TreeNode converetBSTToSLL(TreeNode root){

       head=null;

      convert(root);

       return head;

  }
  private void convert(TreeNode node){

      if(node==null){
          return;
      }
      convert(node.left);
      if(prev==null){
          head=node;
      }else {
          prev.right=node;
      }
      prev=node;
      convert(node.right);
  }

}
