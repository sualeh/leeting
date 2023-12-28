package us.fatehi.leeting.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import us.fatehi.leeting.util.ListNode;

/**
 * Remove Duplicates from Sorted List
 * 
 * Linked List
 * 
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public abstract class ProblemRemoveDuplicates implements Problem {

    public abstract ListNode deleteDuplicates(ListNode head);

    @Test
    public void maintest() {

        ProblemRemoveDuplicates dedupe = (ProblemRemoveDuplicates) solutionObject();

        ListNode deduped1 = dedupe.deleteDuplicates(ListNode.of(1, 1, 1, 2, 3));
        Assertions.assertEquals(deduped1, ListNode.of(1, 2, 3));
    }

}
