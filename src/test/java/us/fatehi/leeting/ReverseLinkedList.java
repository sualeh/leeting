package us.fatehi.leeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import us.fatehi.leeting.util.ListNode;

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

        reversedList = reverseLinkedList.reverseList(null);
        Assertions.assertEquals(null, reversedList, "null list");

        reversedList = reverseLinkedList.reverseList(ListNode.of(1));
        Assertions.assertEquals(ListNode.of(1), reversedList, "Single node");

        reversedList = reverseLinkedList.reverseList(ListNode.of(1, 2));
        Assertions.assertEquals(ListNode.of(2, 1), reversedList, "Two nodes");

        reversedList = reverseLinkedList.reverseList(ListNode.of(1, 1, 1, 2, 3));
        Assertions.assertEquals(ListNode.of(3, 2, 1, 1, 1), reversedList,
                "Happy path, odd number of nodes, including duplicate nodes");

        reversedList = reverseLinkedList.reverseList(ListNode.of(1, 2, 3, 4));
        Assertions.assertEquals(ListNode.of(4, 3, 2, 1), reversedList,
                "Happy path, even number of nodes");
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        System.out.println(">> Given: " + head);
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
                System.out.println("   Built: " + revHead);
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

}
