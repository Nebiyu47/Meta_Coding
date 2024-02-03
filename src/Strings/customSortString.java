package Strings;

public class customSortString {
    public static void main(String[] args) {
        System.out.println(customSortString("cba","abccdzz"));
    }
    public static String customSortString(String order, String s){

       StringBuilder sb = new StringBuilder();
       int[] count= new int[26];

       for(char c : s.toCharArray()){
           count[c-'a']++;
       }
       for(char c: order.toCharArray()){
           while (count[c-'a']-->0){
               System.out.println(c);
               sb.append(c);
           }
       }
       for(char c ='a';c<='z';c++){
           while (count[c-'a']-->0){
               sb.append(c);
           }
       }

       return " ";
    }
}
