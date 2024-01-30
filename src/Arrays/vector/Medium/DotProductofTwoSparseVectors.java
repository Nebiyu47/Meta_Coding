package Arrays.vector.Medium;

import java.util.HashMap;
import java.util.Map;

public class DotProductofTwoSparseVectors {
private final Map<Integer,Integer> map;
    DotProductofTwoSparseVectors(int [] nums){
        map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                map.put(i,nums[i]);
            }
        }

    }
    public int doProduct(DotProductofTwoSparseVectors vec){

        int product=0;


        for(int index: map.keySet()){
            if(vec.map.containsKey(index)){
                product+=map.get(index)*vec.map.get(index);
            }
        }
        return product;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 0, 0, 2, 3};
        int[] nums2 = {0, 3, 0, 4, 0};
     DotProductofTwoSparseVectors v1= new  DotProductofTwoSparseVectors(nums1);
     DotProductofTwoSparseVectors v2= new DotProductofTwoSparseVectors(nums2);

     int result = v1.doProduct(v2);
        System.out.println(result);
    }
}
