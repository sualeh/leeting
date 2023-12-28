package us.fatehi.leeting.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Merge Sorted Arrays.
 * 
 * https://leetcode.com/problems/merge-sorted-array/
 */
public abstract class ProblemMergeSortedLists implements Problem {

    public abstract void merge(int[] nums1, int m, int[] nums2, int n);

    @Test
    public void maintest() {

        ProblemMergeSortedLists mergeSortedLists = (ProblemMergeSortedLists) solutionObject();

        int[] mergedList;

        mergedList = ary(1, 3, 5, 0, 0, 0);
        mergeSortedLists.merge(mergedList, 3, ary(2, 4, 6), 3);
        Assertions.assertArrayEquals(ary(1, 2, 3, 4, 5, 6), mergedList, "Basic Case");

        mergedList = ary(0, 0, 0);
        mergeSortedLists.merge(mergedList, 0, ary(2, 4, 6), 3);
        Assertions.assertArrayEquals(ary(2, 4, 6), mergedList, "Empty Merged Array");

        mergedList = ary(1, 3, 5);
        mergeSortedLists.merge(mergedList, 3, ary(), 0);
        Assertions.assertArrayEquals(ary(1, 3, 5), mergedList, "One Array Empty");

        mergedList = ary(1, 2, 2, 3, 0, 0, 0);
        mergeSortedLists.merge(mergedList, 4, ary(2, 4, 6), 3);
        Assertions.assertArrayEquals(ary(1, 2, 2, 2, 3, 4, 6), mergedList,
                "Arrays with Duplicate Elements");

        mergedList = ary(1, 0);
        mergeSortedLists.merge(mergedList, 1, ary(2), 1);
        Assertions.assertArrayEquals(ary(1, 2), mergedList, "Arrays with One Element");

        mergedList = ary(1, 3, 5, 0, 0, 0, 0);
        mergeSortedLists.merge(mergedList, 3, ary(2, 4, 6, 8), 4);
        Assertions.assertArrayEquals(ary(1, 2, 3, 4, 5, 6, 8), mergedList,
                "Arrays with Different Sizes");

        mergedList = ary(-3, 0, 4, 0, 0, 0);
        mergeSortedLists.merge(mergedList, 3, ary(-1, 1, 2), 3);
        Assertions.assertArrayEquals(ary(-3, -1, 0, 1, 2, 4), mergedList,
                "Arrays with Negative Numbers");

        mergedList = ary(1, 2, 3, 4, 5, 0, 0, 0);
        mergeSortedLists.merge(mergedList, 5, ary(6, 7, 8), 3);
        Assertions.assertArrayEquals(ary(1, 2, 3, 4, 5, 6, 7, 8), mergedList,
                "Arrays Already Merged");

        mergedList = ary(1, 1, 1, 1, 0, 0, 0);
        mergeSortedLists.merge(mergedList, 4, ary(1, 1, 1), 3);
        Assertions.assertArrayEquals(ary(1, 1, 1, 1, 1, 1, 1), mergedList, "1, 1, 1, 1, 1, 1");

    }


    private int[] ary(int... n) {
        return n;
    }

}
