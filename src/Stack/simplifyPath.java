package Stack;

import java.util.Stack;

public class simplifyPath {
    public static String simplifyPath(String path){
        Stack<String> stack = new Stack<>();
        String [] tokens= path.split("/");

        for(String s : tokens){
            System.out.println(s);
        }

        for(String s: tokens){
            if(s.equals(".")||s.isEmpty()){
                continue;
            }else if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else {
                stack.push(s);
            }
        }
        StringBuilder s= new StringBuilder();
        for(String dir : stack){
            s.append("/").append(dir);
        }
        if(s.length()==0){
            return "/";
        }else {
            return s.toString();
        }

    }

    public static void main(String[] args) {
        String path = "/home//mm/../ff";
        System.out.println(simplifyPath(path));
    }
}
