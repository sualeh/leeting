package us.fatehi.leeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import us.ListNode;

/**
 * Reverse Linked List
 * 
 * Linked List
 * 
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {

    @Test
    public void maintest() {

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        ListNode reversedList;

        reversedList = reverseLinkedList.reverseList(ListNode.of(1, 1, 1, 2, 3));
        Assertions.assertEquals(6, reversedList);
    }

    public ListNode reverseList(ListNode head) {
        ListNode revHead;
        ListNode c1, c2, c3;
        c1 = head;
        while (c1 != null) {
            c2 = c1.next;
            if (c2 != null) {
                c3 = c2.next;
            } else {
                c3 = null;
            }
            // Flip c1 and c2
        }
        return revHead;
    }

}
