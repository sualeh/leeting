package us.fatehi.leeting;

import us.ListNode;

/**
 * Linked List
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii
 */
public class RemoveDuplicates2 {

    public static void main(String[] args) {
        RemoveDuplicates2 dedupe = new RemoveDuplicates2();

        ListNode deduped1 = dedupe.deleteDuplicates(ListNode.of(1, 1, 1, 2, 3));
        boolean checkEquals1 = ListNode.checkEquals(deduped1, ListNode.of(2, 3));
        System.out.println(checkEquals1);
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
