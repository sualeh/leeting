package us.fatehi.leeting.solutions;

import us.fatehi.leeting.problems.ProblemRemoveDuplicates;
import us.fatehi.leeting.util.ListNode;


public class RemoveDuplicates extends ProblemRemoveDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = null;
        ListNode newCurrent = null;
        ListNode current = head;
        while (current != null) {
            int val = current.val;
            ListNode newNode = new ListNode(current.val);
            if (newHead == null) {
                newHead = newNode;
            }
            if (newCurrent == null) {
                newCurrent = newNode;
            } else {
                newCurrent.next = newNode;
                newCurrent = newNode;
            }
            while (current != null && current.val == val) {
                current = current.next;
            }
        }
        return newHead;
    }

    @Override
    public ProblemRemoveDuplicates solutionObject() {
        return new RemoveDuplicates();
    }

}
