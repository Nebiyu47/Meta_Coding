package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class isPalindorme {
    public static void main(String[] args) {
        System.out.println(getMismatchedChars("abcdba"));

    }

    public static boolean getMismatchedChars(String s) {
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = clean.length() - 1;


        while(left<right){
            if(clean.charAt(left)!=clean.charAt(right)){

                return isPalindrome(clean,left+1,right)||isPalindrome(clean,left,right-1);

            }
            left++;
            right--;
        }
  return true;

    }
    private static boolean isPalindrome(String s, int left, int right){

        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
