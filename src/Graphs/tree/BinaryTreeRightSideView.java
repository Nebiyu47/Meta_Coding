package Graphs.tree;



import java.util.ArrayList;
import java.util.List;




public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root){
  List<Integer> list= new ArrayList<>();
        rightSideViewHelper(root,list,0);
        return list;
    }
    public List<Integer> rightSideViewHelper(TreeNode root , List<Integer> list, int level){

        if(root==null){
            return list;
        }
        if(level==list.size()){
            list.add(root.val);
        }
        rightSideViewHelper(root.right,list,level+1);
        rightSideViewHelper(root.left,list,level+1);
        return list;
    }
}
