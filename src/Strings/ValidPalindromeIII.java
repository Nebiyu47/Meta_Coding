package Strings;

public class ValidPalindromeIII {
    public static void main(String[] args) {

    }
    public static boolean ValidPalindromeIII(String s , int k){


 return ValidPalindromeIII(s,k);

    }
    private boolean ValidPalindromeIIIHelper(String s , int left , int right , int k){
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return ValidPalindromeIIIHelper(s,left+1,right, k-1) ||
                        ValidPalindromeIIIHelper(s, left,right-1,k-1);
            }
            left++;
            right--;
        }
        return true;
    }
}
