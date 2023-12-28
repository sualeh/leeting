package us.fatehi.leeting.problems;

import org.junit.jupiter.api.Test;
import us.ListNode;

/**
 * Add Two Numbers
 * 
 * Linked List
 * 
 * https://leetcode.com/problems/add-two-numbers/
 */
public abstract class ProblemAddTwoNumbers implements Problem {

    public abstract ListNode addTwoNumbers(ListNode l1, ListNode l2);

    @Test
    public void maintest() {

        ProblemAddTwoNumbers add = (ProblemAddTwoNumbers) solutionObject();

        ListNode sum1 = add.addTwoNumbers(ListNode.of(2, 4, 3), ListNode.of(5, 6, 4));
        boolean checkEquals1 = ListNode.checkEquals(sum1, ListNode.of(7, 0, 8));
        System.out.println(checkEquals1);
    }

}
