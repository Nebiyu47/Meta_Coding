package Arrays.Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    public static void main(String[] args) {
      int[]  nums = {23,2,4,6,7};
      int k = 6;
        System.out.println(checkSubarraySum(nums,6));

    }
    public static boolean checkSubarraySum(int [] nums , int k){
        if(k==0){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==0&&nums[i+1]==0){
                    return true;
                }
            }
            return false;
        }


        Map<Integer, Integer> remainderIndex = new HashMap<>();
        remainderIndex.put(0 ,-1);
        int prefixSum=0;
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            System.out.println();
            int reminder=prefixSum%k;

            if(remainderIndex.containsKey(reminder)){

                if(i-remainderIndex.get(reminder)>1){
                    System.out.println(reminder);
                    return true;
                }
            }
            else{
                remainderIndex.put(reminder ,i);
            }
        }
        return false;
    }
}
