package Arrays.Arrays.Easy;

public class swap {
    public static void main(String[] args) {
        int[] nums = {5, 2, 7, 3, 9, 1};
        sort(nums);
    }

    public static void sort(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                  int temp=nums[j];
                  nums[j]=nums[j+1];
                  nums[j+1]=temp;
                }
            }
        }
    }
}