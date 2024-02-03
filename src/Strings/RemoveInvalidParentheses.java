package Strings;

import java.util.*;

public class RemoveInvalidParentheses {
    public static void main(String[] args) {

    }
    public static List<String> RemoveInvalidParentheses(String s){
      List<String> result= new ArrayList<>();

        Queue<String> queen= new LinkedList<>();
        Set<String> set= new HashSet<>();

        queen.offer(s);
        set.add(s);

        boolean found=false;

        while (!queen.isEmpty()){
            String current=queen.poll();
            if(isValid(current)){
                result.add(current);
                found=true;
            }
            if(found){
                continue;
            }
            for(int i=0;i<current.length();i++){
                if(current.charAt(i)=='('|| current.charAt(i)==')'){
                    String nextStr= current.substring(0,i)+current.substring(i+1);
                    if(!set.contains(nextStr)){
                        queen.offer(nextStr);
                        set.add(nextStr);
                    }
                }
            }
        }
        return result;

    }

    private static boolean isValid(String s){

        int count=0;
        for (char c : s.toCharArray()){
            if(c=='('){
                count++;
            }else if(c==')'){
                count--;
                if(count<0){
                    return false;
                }
            }
        }
        return count==0;
    }
}
