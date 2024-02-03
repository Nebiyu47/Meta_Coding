package Arrays.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
         int [][] intervals = {{1,8},{2,6},{8,10},{15,18}};
        System.out.println(merge(intervals));
    }
    public static int[][] merge(int [][] interval){
        if(interval.length<=1){
            return interval;
        }

        Arrays.sort(interval,(a,b)->Integer.compare(a[0],b[0]));

        List<int[]> merged= new ArrayList<>();
        int[] current= interval[0];
        merged.add(current);

        for(int [] interva: interval){
            int currentEnd= current[1];
            int nextStarrt=interva[0];
            int nextEnd=interva[1];

            if(currentEnd>=nextStarrt){
                current[1]= Math.max(currentEnd,nextEnd);
            }else {
                current=interva;
                merged.add(current);
            }
        }
        return merged.toArray(new int[merged.size()][]);

    }
}
