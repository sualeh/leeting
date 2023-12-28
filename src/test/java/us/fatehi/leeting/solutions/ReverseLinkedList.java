package us.fatehi.leeting.solutions;

import us.fatehi.leeting.problems.ProblemReverseLinkedList;
import us.fatehi.leeting.util.ListNode;


public class ReverseLinkedList extends ProblemReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        DEBUG(">> Given: " + head);
        ListNode c1 = head;
        ListNode c2 = nextNode(c1);
        ListNode c3 = nextNode(c2);
        ListNode revHead = c1;

        do {
            if (c2 != null) {
                if (c1 == head) {
                    c1.next = null;
                }
                c2.next = c1;
                revHead = c2;
                DEBUG("   Built: " + revHead);
                // Move along the list
                c1 = c2;
                c2 = c3;
                c3 = nextNode(c2);
            } else {
                break;
            }
        } while (true);
        return revHead;
    }

    private ListNode nextNode(ListNode head) {
        if (head == null) {
            return null;
        } else {
            return head.next;
        }
    }

    @Override
    public ProblemReverseLinkedList solutionObject() {
        return new ReverseLinkedList();
    }

}
