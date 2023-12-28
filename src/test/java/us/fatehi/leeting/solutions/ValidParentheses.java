package us.fatehi.leeting.solutions;

import java.util.Stack;
import us.fatehi.leeting.problems.ProblemValidParentheses;


public class ValidParentheses extends ProblemValidParentheses {

    public boolean isValid(String s) {

        if (s == null)
            return true;
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

    @Override
    public ProblemValidParentheses solutionObject() {
        return new ValidParentheses();
    }
    
}
