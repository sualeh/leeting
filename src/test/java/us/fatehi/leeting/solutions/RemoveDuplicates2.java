package us.fatehi.leeting.solutions;

import us.fatehi.leeting.problems.ProblemRemoveDuplicates2;
import us.fatehi.leeting.util.ListNode;


public class RemoveDuplicates2 extends ProblemRemoveDuplicates2 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = null;
        ListNode newCurrent = null;
        ListNode current = head;
        while (current != null) {
            int val = current.val;
            ListNode newNode = new ListNode(current.val);
            int dropCount = 0;
            while (current != null && current.val == val) {
                current = current.next;
                dropCount = dropCount + 1;
            }
            if (dropCount == 1) {
                if (newHead == null) {
                    newHead = newNode;
                }
                if (newCurrent == null) {
                    newCurrent = newNode;
                } else {
                    newCurrent.next = newNode;
                    newCurrent = newNode;
                }
            }
        }
        return newHead;
    }

    @Override
    public ProblemRemoveDuplicates2 solutionObject() {
        return new RemoveDuplicates2();
    }
}
