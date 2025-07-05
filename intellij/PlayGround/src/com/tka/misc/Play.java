package com.tka.misc;

import java.util.List;
import java.util.Stack;

public class Play {
    public static void main(String[] args) {
//        System.out.println(binaryOp("1C0C1C1A0B1"));
        System.out.println(validPassword("a2A1_67"));
    }

    static String binaryOp(String str){
        int n = 0;
        Stack<String> stack = new Stack<>();
        stack.push(str.substring(0,1));
        for(int i=1;i<str.length();i++){
            if(str.substring(i,i+1).matches("[ABC]"))
                stack.push(str.substring(i,i+1));
            else {
                String op = stack.pop();
                int bit1 = Integer.parseInt(stack.pop());
                int bit2 = Integer.parseInt(str.substring(i,i+1));
                if(op.equals("A"))
                    op = String.valueOf(bit1 & bit2);
                else if(op.equals("B"))
                    op = String.valueOf(bit1 | bit2);
                else if(op.equals("C"))
                    op = String.valueOf(bit1 ^ bit2);
                stack.push(op);
            }
        }
        return stack.pop();
    }
//You are given a function.
//int CheckPassword(char str[], int n);
//The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
//str is a valid password if it satisfies the below conditions.
//
//– At least 4 characters
//– At least one numeric digit
//– At Least one Capital Letter
//– Must not have space or slash (/)
//– Starting character must not be a number
//Assumption:
//Input string will not be empty.
//
//Example:
//
//Input 1:
//aA1_67
//Input 2:
//a987 abC012
//
//Output 1:
//1
//Output 2:
//0
    static boolean validPassword(String pass){
        if(pass.length()<4) return false;
        boolean flag = pass.matches(".*[0-9].*")
                && pass.matches(".*[A-Z].*")
                && pass.matches("[^\\s/]*")
                && pass.matches("[^0-9].*");
        System.out.println(flag);
        return flag;
    }
}
