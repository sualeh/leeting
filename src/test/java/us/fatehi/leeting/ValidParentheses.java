package us.fatehi.leeting;

import java.io.PrintWriter;
import java.util.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Stack
 * https://leetcode.com/problems/valid-parentheses
 */
public class ValidParentheses {

    @Test
    public void maintest() {

        ValidParentheses validParentheses = new ValidParentheses();

        Assertions.assertEquals(false, validParentheses.isValid("([)]"), "\"" + "([)]" + "\"");

        Assertions.assertEquals(true, validParentheses.isValid("()[]{}"), "\"" + "()[]{}" + "\"");

        Assertions.assertEquals(true, validParentheses.isValid("([])"), "\"" + "([])" + "\"");
    }

    public boolean isValid(String s) {
        System.out.println("new case=" + s);
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
}
