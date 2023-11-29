package us.fatehi.leeting;

import java.util.Stack;

public class ValidParentheses {

        public static void main(String args[]) {
            ValidParentheses main = new ValidParentheses();

            System.out.println("\"" + "([)]" + "\" --> " + main.isValid("([)]"));
            
            System.out.println("\"" + "()[]{}" + "\" --> " + main.isValid("()[]{}"));

            System.out.println("\"" + "([])" + "\" --> " + main.isValid("([])"));
        }

        public boolean isValid(String s) {
            System.out.println("new case=" + s);
            if (s == null)  return true;
            Stack<Character> bracket = new Stack<Character>();
            for (int i = 0; i < s.length(); i++) {
                char currchar = s.charAt(i);
                switch (currchar) {
                    case '{':
                    case '[':
                    case '(':
                        bracket.push(currchar);
                        break;
                    case '}':
                    case ']':
                    case ')':
                        if (bracket.isEmpty()) {
                            return false;
                        }  
                        char lastopen = bracket.pop();
                        System.out.println("open=" + lastopen + " close=" + currchar);
                        if (currchar == '}' && lastopen != '{') {
                            return false;
                        } 
                        if (currchar == ']' && lastopen != '[') {
                            return false;
                        } 
                        if (currchar == ')' && lastopen != '(') {
                            return false;
                        }             
                        break;
                } 
            }
            return bracket.isEmpty();
        }
    }