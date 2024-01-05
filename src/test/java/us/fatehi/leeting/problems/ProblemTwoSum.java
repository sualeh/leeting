package us.fatehi.leeting.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Two Sum.
 *
 * https://leetcode.com/problems/two-sum/
 */
public abstract class ProblemTwoSum implements Problem {

  public abstract int[] twoSum(int[] nums, int target);

  @Test
  public void testImplementation() {

    ProblemTwoSum twoSum = (ProblemTwoSum) solutionObject();

    int[] addendIndexes;

    addendIndexes = twoSum.twoSum(new int[] {}, 0);
    Assertions.assertArrayEquals(new int[] {}, addendIndexes, "");

    addendIndexes = twoSum.twoSum(new int[] {2, 7, 11, 15}, 9);
    Assertions.assertArrayEquals(new int[] {0, 1}, addendIndexes, "Basic Case");

    addendIndexes = twoSum.twoSum(new int[] {3, 2, 4}, 6);
    Assertions.assertArrayEquals(new int[] {1, 2}, addendIndexes,
        "Positive Case with Unique Solution");

    addendIndexes = twoSum.twoSum(new int[] {1, 2, 3, 4, 5}, 20);
    Assertions.assertArrayEquals(new int[] {}, addendIndexes, "Negative Case - No Solution");

    addendIndexes = twoSum.twoSum(new int[] {}, 5);
    Assertions.assertArrayEquals(new int[] {}, addendIndexes, "Negative Case - Empty Array");

    addendIndexes = twoSum.twoSum(new int[] {3, 3}, 6);
    Assertions.assertArrayEquals(new int[] {0, 1}, addendIndexes,
        "Positive Case with Duplicate Elements");

    addendIndexes = twoSum.twoSum(new int[] {-1, -2, -3, -4, -5}, -8);
    Assertions.assertArrayEquals(new int[] {2, 4}, addendIndexes,
        "Positive Case with Negative Numbers");

    addendIndexes = twoSum.twoSum(new int[] {-1, 0, 1, 2, -1, -4}, 0);
    Assertions.assertArrayEquals(new int[] {0, 2}, addendIndexes, "Positive Case with Zero Target");

    addendIndexes = twoSum.twoSum(new int[] {5}, 5);
    Assertions.assertArrayEquals(new int[] {}, addendIndexes, "Array with One Element");

    addendIndexes = twoSum.twoSum(new int[] {3, 2}, 5);
    Assertions.assertArrayEquals(new int[] {0, 1}, addendIndexes,
        "Array with Two Elements - Positive Case");
  }

}
