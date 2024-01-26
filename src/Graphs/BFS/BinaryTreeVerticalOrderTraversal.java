package Graphs.BFS;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class BinaryTreeVerticalOrderTraversal {

    public List<List<Integer>> Verticalorder(TreeNode root){

        List<List<Integer>> result= new ArrayList<>();

        if(root==null){
            return result;
        }
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();

        travis(root,map,0);
        for(List<Integer> list : map.values()){
               result.add(list);
           }
        return result;

    }
    public static void travis(TreeNode node, TreeMap<Integer, List<Integer>> map , int hd){

        if(node==null){
            return ;
        }
        map.putIfAbsent(hd, new ArrayList<>());
        map.get(hd).add(node.val);
        travis(node.left,map,hd-1);
        travis(node.right,map,hd+1);
    }

    public static void main(String[] args) {

    }
}
