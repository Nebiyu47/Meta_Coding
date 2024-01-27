package Graphs.tree;

import java.util.ArrayList;
import java.util.List;

public class FindAllNodeIsLonely {
    public List<Integer> lonelyNode(TreeNode node){
        List<Integer> result = new ArrayList<>();
        if(node==null){
            return result;
        }
         dfs(node,result);
        return result;
    }
    private void dfs(TreeNode node, List<Integer> lonelyNode){

         if(node==null){
             return;
         }

         if((node.left!=null&&node.right==null)||(node.left==null&&node.right!=null)){

             if(node.left==null){
                 lonelyNode.add(node.right.val);
             }else if(node.right==null){
                 lonelyNode.add(node.left.val);
             }
        }
        dfs(node.left,lonelyNode);
         dfs(node.right,lonelyNode);
    }
}
