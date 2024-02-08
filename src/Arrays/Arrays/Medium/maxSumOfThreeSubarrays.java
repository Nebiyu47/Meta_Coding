package Arrays.Arrays.Medium;

public class maxSumOfThreeSubarrays {
    public static void main(String[] args) {
        int [] nums = {1,2,1,2,6,7,5,1};
        int k = 2;
        System.out.println(maxSumOfThreeSubarrays(nums,k));
    }
    public static int[] maxSumOfThreeSubarrays(int [] nums, int k){

        int n= nums.length;
        int[] prefixSum= new int[n+1];

        for (int i=0;i<n;i++){
            prefixSum[i+1]=prefixSum[i]+nums[i];
         //   System.out.println(prefixSum[i+1]);
        }
        int [] leftMaxSum= new int[n];
        int [] rightMaxSum= new int[n];
        int maxSum= Integer.MIN_VALUE;

        for(int i=k-1;i<n;i++){
            int leftSum=prefixSum[i+1]-prefixSum[i+1-k];
            int rightSum=prefixSum[i+k+1]-prefixSum[i+1];

            if(leftSum>maxSum){
                maxSum=leftSum;
            }
            leftMaxSum[i]=maxSum;
            if(rightSum>maxSum){
                maxSum=rightSum;
            }
            rightMaxSum[n-i-1]=maxSum;
        }
        int[] result= new int[3];
        maxSum=Integer.MIN_VALUE;
        for(int i=k; i<=n-2*k ;i++){
            int leftIndex= i-k;
            int rightIndex=i+k;
            int leftSum= leftMaxSum[leftIndex];
            int rightSum=rightMaxSum[rightIndex];
            int totalSum=prefixSum[i+k]-prefixSum[i]+leftSum+rightSum;

            if(totalSum>maxSum){
                maxSum=totalSum;
                result[0]=leftIndex;
                result[1]=i;
                result[2]=rightIndex;
            }
        }
        return result;
    }
}
