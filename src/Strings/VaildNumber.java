package Strings;

public class VaildNumber {
    public static boolean  isNumber(String s){
        if(s==null||s.trim().length()==0){
            return false;
        }
       boolean seenNumber=false;
       boolean seenE=false;
       boolean seenDot= false;
       s=s.trim();
       for(int i=0;i<s.length();i++){
           char ch= s.charAt(i);
           if(Character.isDigit(ch)){
               seenNumber=true;
           } else if(ch=='e'||ch=='E'){
               if(seenE|| ! seenNumber){
                   return false;
               }
               seenE=true;
               seenNumber=false;
           }else if(ch=='.'){
               if(seenDot||seenE){
                   return false;
               }
               seenDot=true;
           }
       }


        return true;
    }

    public static void main(String[] args) {
        System.out.println(isNumber("abc"));
    }
}
