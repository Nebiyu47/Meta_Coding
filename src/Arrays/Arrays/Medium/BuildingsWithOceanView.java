package Arrays.Arrays.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BuildingsWithOceanView {
    public static int[] BuildingsWithOceanView(int[] heights) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
      for(int i=heights.length-1;i>=0;i++){
          if(stack.isEmpty()||heights[i]>heights[stack.peek()]){
              result.add(0,i);
              stack.push(i);
          }
      }

        int[] newArray = result.stream().mapToInt(Integer::intValue).toArray();
        return newArray;

    }

    public static void main(String[] args) {
        int[] heights = {4, 2, 3, 1};
        System.out.println(BuildingsWithOceanView(heights));
    }
}