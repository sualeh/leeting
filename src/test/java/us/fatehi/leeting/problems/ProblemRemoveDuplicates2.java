package us.fatehi.leeting.problems;

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
public abstract class ProblemRemoveDuplicates2 implements Problem {

    @Test
    public void testImplementation() {

        ProblemRemoveDuplicates2 dedupe = (ProblemRemoveDuplicates2) solutionObject();

        ListNode deduped1 = dedupe.deleteDuplicates(ListNode.of(1, 1, 1, 2, 3));
        Assertions.assertEquals(deduped1, ListNode.of(2, 3));
    }

    public abstract ListNode deleteDuplicates(ListNode head);

}
