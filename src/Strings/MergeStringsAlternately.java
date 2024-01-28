package Strings;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        System.out.println(MergeStringsAlternately("abc","edf"));
    }
    public static String MergeStringsAlternately(String word1, String word2){

        int  maxLength=  Math.max(word1.length(), word2.length());
        StringBuilder stringBuilder = new StringBuilder();
          for(int i=0;i<maxLength;i++){

              if( i<word1.length()){
                  stringBuilder.append(word1.charAt(i));
              }if(i<word2.length()){
                  stringBuilder.append(word2.charAt(i));
              }
          }
        return stringBuilder.toString();
    }
}
