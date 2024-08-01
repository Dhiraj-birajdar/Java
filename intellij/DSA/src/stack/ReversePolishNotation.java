package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
    }

    static public int evalRPN(String[] tokens) {
        int i=0;
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens){
            if(token.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(token.equals("-")){
                i = stack.pop();
                stack.push(stack.pop()-i);
            }else if(token.equals("/")){
                i = stack.pop();
                stack.push(stack.pop()/i);
            }else if(token.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else
                stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }
    static public int evalPostFix(String[] tokens) {
        int i=0;
        List<Integer> list = new ArrayList<>();
        for(String token: tokens){
            if(token.equals("+")){
                list.add(list.remove(list.size()-1)+list.remove(list.size()-1));
            }else if(token.equals("-")){
                i = list.remove(list.size()-1);
                list.add(list.remove(list.size()-1)-i);
            }else if(token.equals("/")){
                i = list.remove(list.size()-1);
                list.add(list.remove(list.size()-1)/i);
            }else if(token.equals("*")){
                list.add(list.remove(list.size()-1)*list.remove(list.size()-1));
            }else
                list.add(Integer.parseInt(token));
        }
        return list.remove(list.size()-1);
    }
}
