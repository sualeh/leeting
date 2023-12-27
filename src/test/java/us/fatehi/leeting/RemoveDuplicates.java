package us.fatehi.leeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import us.ListNode;

/**
 * Remove Duplicates from Sorted List
 * 
 * Linked List
 * 
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicates {
    @Test
    public void maintest() {

        RemoveDuplicates dedupe = new RemoveDuplicates();

        ListNode deduped1 = dedupe.deleteDuplicates(ListNode.of(1, 1, 1, 2, 3));
        Assertions.assertEquals(deduped1, ListNode.of(1, 2, 3));
    }

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
}
