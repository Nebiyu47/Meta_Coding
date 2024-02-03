package Arrays.Arrays.Medium;

public class nextPermutation {
    public static void main(String[] args) {

        int m [] ={1,2,3};
 nextPermutation(m);

    }
    public static void nextPermutation(int[] nums){

        int i= nums.length-2;

        while (i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j= nums.length-1;
            while (j>0&&nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    private static void swap(int [] nums, int i , int  j){

        int temp=nums[i];
        nums[i]= nums[j];
        nums[j]=temp;
    }
    private static void  reverse(int [] nums, int i){

        int end =nums.length-1;

        while (i<end){
            swap(nums,i,end);
            i++;
            end--;
        }
    }
}
