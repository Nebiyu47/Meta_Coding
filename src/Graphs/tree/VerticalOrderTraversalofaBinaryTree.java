package Graphs.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class VerticalOrderTraversalofaBinaryTree {

    public List<List<Integer>> verticalTraversal(TreeNode root){

        List<List<Integer>> result= new ArrayList<>();
        if(root==null){
            return result;
        }
        TreeMap<Integer,TreeMap<Integer,List<Integer>>> map= new TreeMap<>();
        dfs(root,0,0,map);

        for (TreeMap<Integer,List<Integer>> m : map.values()){
            List<Integer> coulum= new ArrayList<>();
            for (List<Integer>  level: m.values()){
                Collections.sort(level);
                coulum.addAll(level);
            }
            result.add(coulum);
        }
        return result;
    }

    public void dfs(TreeNode node , int x, int y , TreeMap<Integer,TreeMap<Integer, List<Integer>>>map){

        if(node==null){
            return;
        }
        map.putIfAbsent(x,new TreeMap<>());
        TreeMap<Integer,List<Integer>> coulumMap= map.get(x);
        coulumMap.putIfAbsent(y, new ArrayList<>());
        coulumMap.get(y).add(node.val);
        dfs(node.left,x-1,y+1,map);
        dfs(node.right,x+1,y+1,map);
    }
}
