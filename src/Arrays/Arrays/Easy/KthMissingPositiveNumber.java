package Arrays.Arrays.Easy;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
  int[] arr = {2,3,4,7,11} ;
   int k = 5;
        System.out.println(KthMissingPositiveNumber(arr,k));
    }
    public static int KthMissingPositiveNumber(int[] arr, int k){
        int count=0;
        int last=0;

        for(int num: arr){
            int missingCount=num-last-1;
             if(count+missingCount>=k){

                 return last+(k-count);
             }
             count+=missingCount;
             last=num;

        }
        return 1;
    }
}
