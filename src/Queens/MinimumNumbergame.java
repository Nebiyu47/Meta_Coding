package Queens;

import java.util.PriorityQueue;

public class MinimumNumbergame {
    public static void main(String[] args) {
        int [] nums={5,4,2,3};
        for(int i=0;i<nums.length;i++) {
            System.out.println(numberGame(nums));
        }
        }
    public static int[] numberGame(int [] nums){

        PriorityQueue<Integer> minhub= new PriorityQueue<>();

        for(int n : nums){
            minhub.offer(n);
        }


        StringBuilder alice= new StringBuilder();
        StringBuilder bob= new StringBuilder();
        while (!minhub.isEmpty()){
            alice.append(minhub.poll());

            bob.append(minhub.poll());
        }
        String m = alice.toString();
        String g=bob.toString();
        StringBuilder f= new StringBuilder();
        int maxLength=Math.max(m.length(),g.length());

        while (m.length()<maxLength){
            m+= " ";
        }
        while (g.length()<maxLength){
            g+=" ";
        }

        for (int i=0;i<maxLength;i++){
            f.append(g.charAt(i)).append(m.charAt(i));
        }
       int [] newArray= new int[f.length()];
        for (int i=0;i<newArray.length;i++){
            newArray[i]=f.charAt(i);
        }
        return newArray;

    }
}
