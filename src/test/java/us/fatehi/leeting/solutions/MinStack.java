package us.fatehi.leeting.solutions;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import us.fatehi.leeting.problems.ProblemMinStack;


public class MinStack extends ProblemMinStack {

  public class MinStackImpl implements ProblemMinStack.MinStack {

    private int top;
    private List<Integer> stack;
    private List<Integer> minStack;

    public MinStackImpl() {
      this.top = -1;
      this.stack = new ArrayList<Integer>();
      this.minStack = new ArrayList<Integer>();
    }

    public void push(int x) {
      top++;
      stack.add(x);
      if (top == 0) {
        minStack.add(x);
      } else {
        int newMin = Math.min(minStack.get(top - 1), x);
        minStack.add(newMin);
      }
    }

    public void pop() {
      if (top < 0) {
        throw new EmptyStackException();
      }
      stack.remove(top);
      minStack.remove(top);
      top--;
    }

    public int top() {
      if (top < 0) {
        throw new EmptyStackException();
      }
      return stack.get(top);
    }

    public int getMin() {
      if (top < 0) {
        throw new EmptyStackException();
      }
      return minStack.get(top);
    }

  }

  @Override
  public ProblemMinStack.MinStack solutionObject() {
    return new MinStackImpl();
  }

}
