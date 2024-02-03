package Stack;

import java.util.Stack;

public class minAddToMakeValid {
    public static void main(String[] args) {

    }
    public static int minAddToMakeValid(String s){



         Stack<Character> stack = new Stack<>();

         int count=0;

         for(char c: s.toCharArray()){
             if(c=='('){
                 stack.push(c);
             }else if(c==')'){
                 if(!stack.isEmpty()&&stack.peek()=='('){
                     stack.pop();
                 }
             }else {
                 count++;
             }
         }
         count+=stack.size();
         return count;
    }
}
