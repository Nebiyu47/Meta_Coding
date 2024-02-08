package Arrays.Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class DiagonalTraverse {

    public static void main(String[] args) {

         int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(findDiagnoalTraversae(mat));
    }
    public  static int[] findDiagnoalTraversae(int[][] mat){

        List<Integer> result= new ArrayList<>();
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
               if(i+j==mat[0].length-1){
                   result.add(mat[i][j]);
               }
            }
        }
        int [] newArray=result.stream().mapToInt(Integer::intValue).toArray();
        return  newArray;
    }
}
