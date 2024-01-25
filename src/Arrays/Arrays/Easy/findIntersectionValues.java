package Arrays.Arrays.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findIntersectionValues {
    public static void main(String[] args) {

    }
    public static int [] findIntersectionValues(int [] nums1 , int[] nums2){

        HashMap<Integer,Integer> map= new HashMap<>();

        List<Integer> intersections= new ArrayList<>();

        for(int n : nums1){
            map.put(n ,map.getOrDefault(n,0)+1);
        }

        for(int num : nums2){
            if(map.containsKey(num)&&map.get(num)>0){
                intersections.add(num);
                map.put(num)
            }
        }
    }
}
