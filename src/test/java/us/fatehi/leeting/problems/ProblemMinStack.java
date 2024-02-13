package us.fatehi.leeting.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.EmptyStackException;
import org.junit.jupiter.api.Test;

/**
 * 155. Min Stack.
 *
 * https://leetcode.com/problems/min-stack/
 */
public abstract class ProblemMinStack implements Problem {


  /**
   * Your MinStack object will be instantiated and called as such:
   *
   * <pre>
   * MinStack obj = new MinStack();
   * obj.push(val);
   * obj.pop();
   * int param_3 = obj.top();
   * int param_4 = obj.getMin();
   * </pre>
   */
  public interface MinStack {

    public abstract void push(int val);

    public void pop();

    public int top();

    public int getMin();
  };

  @Test
  public void testImplementation() {
    MinStack minStack;

    // Empty stack
    minStack = (MinStack) solutionObject();
    assertThrows(EmptyStackException.class, minStack::getMin);
    assertThrows(EmptyStackException.class, minStack::pop);
    assertThrows(EmptyStackException.class, minStack::top);

    // Happy path
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    assertEquals(-3, minStack.getMin());
    minStack.pop();
    assertEquals(0, minStack.top());
    assertEquals(-2, minStack.getMin());

    // Pop last element
    minStack.pop();
    minStack.pop();
    assertThrows(EmptyStackException.class, minStack::getMin);
    assertThrows(EmptyStackException.class, minStack::pop);
    assertThrows(EmptyStackException.class, minStack::top);

    // Same element multiple times
    minStack.push(-2);
    minStack.push(-2);
    minStack.push(-2);
    minStack.push(-2);
    assertEquals(-2, minStack.getMin());
    minStack.pop();
    minStack.pop();
    assertEquals(-2, minStack.getMin());
  }

}
