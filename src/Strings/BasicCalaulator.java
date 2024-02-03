package Strings;

import java.util.Stack;

public class BasicCalaulator {
    public int calculate(String s){

        Stack<Integer> stack = new Stack<>();
        char sign='+';
        int num=0;

        for (int i=0;i<s.length();i++){

            char ch=s.charAt(i);

            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            if((!Character.isDigit(ch)&&ch!=' ') || i==s.length()-1){

                if(sign=='+'){
                    stack.push(num);
                }else if(sign=='-'){
                    stack.push(num);
                }else if(sign=='*'){
                    stack.push(stack.peek()*num);
                }else if(sign=='/'){
                    stack.push(stack.peek()/num);
                }
                sign=ch;
                num=0;
            }
        }
         int result=0;
        while (!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }
}
