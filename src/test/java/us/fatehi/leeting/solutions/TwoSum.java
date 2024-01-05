package us.fatehi.leeting.solutions;

import java.util.HashMap;
import java.util.Map;
import us.fatehi.leeting.problems.ProblemTwoSum;

public class TwoSum extends ProblemTwoSum {

  @Override
  public int[] twoSum(int[] nums, int target) {
    if (nums == null) {
      return new int[] {};
    }
    final Map<Integer, Integer> complements = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      final int num = nums[i];
      final int complement = target - num;
      if (complements.containsKey(complement)) {
        return new int[] {complements.get(complement), i};
      }
      complements.put(num, i);
    }
    return new int[] {};
  }

  @Override
  public TwoSum solutionObject() {
    return new TwoSum();
  }
}
