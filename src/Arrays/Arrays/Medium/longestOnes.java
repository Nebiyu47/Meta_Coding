package Arrays.Arrays.Medium;

public class longestOnes {
    public static void main(String[] args) {

    }
    public static int longestOnes(int [] nusm , int k){

        int right;
        int left=0;

        for(right=0;right<nusm.length;right++){
            if(nusm[right]==0){
                k--;
            }
            if (k<0&&nusm[left++]==0){
                k++;
            }
        }
        return right-left;
    }
}
