package Strings;

public class ValidWordAbbreviation {
    public static void main(String[] args) {

    }
    public boolean validWordAbbreviation(String word1, String word2){

        int i=0;
        int j=0;



         while(i< word1.length()&& j<word2.length()) {
             if (Character.isDigit(word2.charAt(j))) {
                 if (word2.charAt(j) == '0') {
                     return false;
                 }
                 int count = 0;
                 while (j < word2.length() && Character.isDigit(word2.charAt(j))) {

                     count = count * 10 + word2.charAt(j) + '0';
                     j++;
                 }
                 i += count;
             } else {
                 if (word1.charAt(i) != word1.charAt(j)) {
                     return false;
                 }
                 i++;
                 j++;
             }

         }
         return i==word1.length()&&j==word2.length();
    }
}
