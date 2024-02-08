package Tree.BFS;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
class Soultion {
  public static String subarraySum(String s1, String s2 ) {
      StringBuilder stringBuilder =new  StringBuilder();
      int i=s1.length()-1;
      int j=s2.length()-1;

      int carry=0;

      while (i>=0 || j>=0 || carry!=0){

          int digts=0;
          if(i>=0){
              digts=s1.charAt(i--)-'0';
          }
          int digts2=0;
          if(j>=0){
              digts2=s2.charAt(j--)-'0';
          }
          int sum=digts+digts2+carry;
          carry=sum/10;

          stringBuilder.insert(0,sum%10);

  }
      return stringBuilder.toString();


    }

    public static void main(String[] args) {
        TreeNode node= new TreeNode(1);
        node.left=new TreeNode(2);
        node.right= new TreeNode(3);
        node.left.left= new TreeNode(4);
        node.left.right= new TreeNode(5);

        Soultion soultion= new Soultion();
           int[] nums ={-1,0,1,2,-1,-4};
           int k=3;

        System.out.println(subarraySum("12","13"));
    }
}





