package Arrays.Arrays.Easy;

import java.util.PriorityQueue;

public class findKthLargest {
    public static int findKthLargest(int[] nums , int k ){

        PriorityQueue<Integer> minHeap= new PriorityQueue<>(k);

        for(int i=0;i<nums.length;i++){
            minHeap.offer(nums[i]);
        }

        for(int n: minHeap){
            System.out.println(minHeap.peek());
        }

        for(int i=k;i<nums.length;i++){

       //     System.out.println(minHeap.peek());
            if(nums[i]>minHeap.peek()){
               // System.out.println(minHeap.peek());
                minHeap.poll();
               // System.out.println(minHeap.poll());
               // System.out.println("-------------");
                minHeap.offer(nums[i]);
              //  System.out.println(minHeap.offer(nums[i]));
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] num = {3,2,1,5,6,4};
        int  k = 2;

        System.out.println(findKthLargest(num,k));
    }
}
