package Arrays.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {

    }
    public static int [] SortArrayByParity(int [] nums){

        ArrayList<Integer> list= new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                list.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                list.add(nums[i]);
            }
        }
        int [] arat= list.stream().mapToInt(Integer::intValue).toArray();

        return arat;
    }
}
