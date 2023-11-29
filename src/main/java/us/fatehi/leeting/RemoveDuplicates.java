package us.fatehi.leeting;

import us.ListNode;

/**
 * Linked List
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        RemoveDuplicates dedupe = new RemoveDuplicates();

        ListNode deduped1 = dedupe.deleteDuplicates(ListNode.of(1, 1, 1, 2, 3));
        boolean checkEquals1 = ListNode.checkEquals(deduped1, ListNode.of(1, 2, 3));
        System.out.println(checkEquals1);
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
