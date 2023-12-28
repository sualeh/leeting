package us.fatehi.leeting;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Merge Sorted Arrays.
 * 
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedLists {

    @Test
    public void maintest() {

        MergeSortedLists mergeSortedLists = new MergeSortedLists();

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

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Basic error checks
        if (nums1 == null || nums1.length == 0) {
            return;
        }
        if (nums2 == null || nums2.length == 0 || n == 0) {
            return;
        }


        System.out.printf("> %s {%d}, %s {%d}%n", Arrays.toString(nums1), m, Arrays.toString(nums2),
                n);

        // Renamed variables, and make pointers
        int[] ary1 = Arrays.copyOfRange(nums1, 0, m);
        int p_ary1 = 0;
        int[] ary2 = nums2;
        int p_ary2 = 0;
        int[] merged = nums1;
        int p_merged = 0;

        while (p_ary1 < m && p_ary2 < n) {
            int num1 = ary1[p_ary1];
            int num2 = ary2[p_ary2];
            if (num1 <= num2) {
                p_ary1 = p_ary1 + 1;
                merged[p_merged] = num1;
            } else {
                p_ary2 = p_ary2 + 1;
                merged[p_merged] = num2;
            }
            p_merged = p_merged + 1;
        }

        // Debug
        System.out.println(Arrays.toString(merged));
        System.out.println(Arrays.toString(Arrays.copyOfRange(ary1, p_ary1, ary1.length)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(ary2, p_ary2, ary2.length)));

        // Finish up the first array
        while (p_ary1 < m) {
            int num1 = ary1[p_ary1];
            p_ary1 = p_ary1 + 1;
            merged[p_merged] = num1;
            p_merged = p_merged + 1;
        }

        // Finish up the second array
        while (p_ary2 < n) {
            int num2 = ary2[p_ary2];
            p_ary2 = p_ary2 + 1;
            merged[p_merged] = num2;
            p_merged = p_merged + 1;
        }

        System.out.println(Arrays.toString(merged));

    }

    private int[] ary(int... n) {
        return n;
    }

}
