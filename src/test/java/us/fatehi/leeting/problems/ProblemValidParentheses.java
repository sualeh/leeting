package us.fatehi.leeting.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Stack https://leetcode.com/problems/valid-parentheses
 */
public abstract class ProblemValidParentheses implements Problem {

    public abstract boolean isValid(String s);

    @Test
    public void testImplementation() {

        ProblemValidParentheses validParentheses = (ProblemValidParentheses) solutionObject();

        Assertions.assertEquals(false, validParentheses.isValid("([)]"), "\"" + "([)]" + "\"");

        Assertions.assertEquals(true, validParentheses.isValid("()[]{}"), "\"" + "()[]{}" + "\"");

        Assertions.assertEquals(true, validParentheses.isValid("([])"), "\"" + "([])" + "\"");
    }

}
