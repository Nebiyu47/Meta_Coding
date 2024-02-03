package Arrays.Arrays.Medium;

import java.math.BigDecimal;
import java.util.*;

class Solution {

     private Map<Integer, List<Integer>> indexMap;

   public Solution(int[] nums){

       indexMap=new HashMap<>();
       for(int i=0;i<nums.length;i++){
           if(!indexMap.containsKey(nums[i])){
               indexMap.put(nums[i],new ArrayList<>());
           }
           indexMap.get(nums[i]).add(i);

       }
   }
   public int pick(int target){
        String j = Integer.toString(target);
       BigDecimal m = BigDecimal.valueOf(Integer.parseInt(j));

       if(indexMap.containsKey(target)){
           List<Integer> indices = indexMap.get(target);
           Random rand= new Random();
           return indices.get(rand.nextInt(indices.size()));
       }
       return -1;
   }


    public static void main(String[] args) {

    }
}
