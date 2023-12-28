package us.fatehi.leeting.solutions;

import us.ListNode;
import us.fatehi.leeting.problems.ProblemAddTwoNumbers;


public class AddTwoNumbers extends ProblemAddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lc1 = l1;
        ListNode lc2 = l2;
        ListNode newNumber = null;
        ListNode newCurrent = null;
        int carryOver = 0;
        while (lc1 != null || lc2 != null) {
            int sum = carryOver;
            carryOver = 0;
            if (lc1 != null) {
                sum = sum + lc1.val;
                lc1 = lc1.next;
            }
            if (lc2 != null) {
                sum = sum + lc2.val;
                lc2 = lc2.next;
            }
            if (sum > 9) {
                sum = sum % 10;
                carryOver = 1;
            }
            ListNode newNode = new ListNode(sum);
            if (newNumber == null) {
                newNumber = newNode;
            }
            if (newCurrent == null) {
                newCurrent = newNode;
            } else {
                newCurrent.next = newNode;
                newCurrent = newCurrent.next;
            }
        }
        if (carryOver == 1) {
            newCurrent.next = new ListNode(1);
        }
        return newNumber;
    }

    @Override
    public ProblemAddTwoNumbers solutionObject() {
        return new AddTwoNumbers();
    }

}
