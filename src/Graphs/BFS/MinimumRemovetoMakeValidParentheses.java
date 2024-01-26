package Graphs.BFS;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinimumRemovetoMakeValidParentheses {

public static String mimRemovalToMakeValid(String s){


    Stack<Integer>stack = new Stack<>();
    Set<Integer> set= new HashSet<>();

    for(int i=0;i<s.length();i++){
        char c= s.charAt(i);
        if(c=='('){
            stack.push(i);
        }else if(c==')') {
            if (!stack.isEmpty()) {
                stack.pop();

            } else {
                set.add(i);
            }

        }
    }
//  while (!stack.isEmpty()){
//       set.add(stack.pop());
//   }
    StringBuilder stringBuilder = new StringBuilder();

    for(int i=0;i<s.length();i++){
        if(!set.contains(i)){
            stringBuilder.append(s.charAt(i));
        }
    }
    return stringBuilder.toString();
}

    public static void main(String[] args) {
        System.out.println(mimRemovalToMakeValid("lee(t(c)o)de)"));
    }
}
