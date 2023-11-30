package com.aditya.StackAndQueue;

import java.util.*;

public class ValidParenthesis {
     public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    if(stack.pop() != '(' || stack.isEmpty()) {
                        return false;
                    }
                }
                if (ch == ')') {
                    if(stack.pop() != '{' || stack.isEmpty()) {
                        return false;
                    }
                }
                if (ch == ')') {
                    if(stack.pop() != '[' || stack.isEmpty()) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
