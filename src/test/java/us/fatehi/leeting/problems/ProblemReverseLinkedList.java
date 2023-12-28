package us.fatehi.leeting.problems;

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
public abstract class ProblemReverseLinkedList implements Problem {

    public abstract ListNode reverseList(ListNode head);

    @Test
    public void testImplementation() {

        ProblemReverseLinkedList reverseLinkedList = (ProblemReverseLinkedList) solutionObject();

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

}
