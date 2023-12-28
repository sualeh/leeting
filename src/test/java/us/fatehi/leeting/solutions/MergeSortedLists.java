package us.fatehi.leeting.solutions;

import java.util.Arrays;
import us.fatehi.leeting.problems.ProblemMergeSortedLists;


public class MergeSortedLists extends ProblemMergeSortedLists {

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

    public ProblemMergeSortedLists solutionObject() {
        return new MergeSortedLists();
    }

}
