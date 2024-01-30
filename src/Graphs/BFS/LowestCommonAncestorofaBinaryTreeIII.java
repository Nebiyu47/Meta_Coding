package Graphs.BFS;

import java.util.HashSet;
import java.util.Set;

class Node{
    public int val;
    public Node left;
    public Node right;
    public Node parent;
    Node(int x){
        this.val=x;
    }
} ;

public  class LowestCommonAncestorofaBinaryTreeIII {

   public  Node LowestCommonAncestorofaBinaryTreeIII(Node p ,Node q){

       Set<Node> visited= new HashSet<>();

       while (p!=null){
           visited.add(p);
           p=p.parent;
       }
       while (q!=null){
           if(visited.contains(q)){
               return q;
           }
           q=q.parent;
       }
       return null;
     }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left=new Node(5);
        root.right=new Node(1);
        root.left.left= new Node(6);
        root.left.right= new Node(2);
        root.right.left= new Node(0);
        root.right.right= new Node(8);
        root.left.right.left= new Node(7);
        root.left.right.right= new Node(4);
        Node p= root.left;
        Node q = root.right;
        LowestCommonAncestorofaBinaryTreeIII   lowestCommonAncestorofaBinaryTreeIII= new LowestCommonAncestorofaBinaryTreeIII();

        System.out.println( lowestCommonAncestorofaBinaryTreeIII.LowestCommonAncestorofaBinaryTreeIII(p,q));
   }
}
