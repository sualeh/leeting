package us.fatehi.leeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import us.fatehi.leeting.util.ListNode;

/**
 * Remove Duplicates from Sorted List II
 * 
 * Linked List
 * 
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii
 */
public class RemoveDuplicates2 {

    @Test
    public void maintest() {

        RemoveDuplicates2 dedupe = new RemoveDuplicates2();

        ListNode deduped1 = dedupe.deleteDuplicates(ListNode.of(1, 1, 1, 2, 3));
        Assertions.assertEquals(deduped1, ListNode.of(2, 3));
    }

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
}
