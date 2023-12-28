package us.fatehi.leeting.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Best Time to Buy and Sell Stock
 * 
 * Windowing
 * 
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public abstract class ProblemMaximumProfit implements Problem {

    public abstract int maxProfit(int[] prices);

    @Test
    public void testImplementation() {

        ProblemMaximumProfit maxProfit = (ProblemMaximumProfit) solutionObject();

        int profit;

        profit = maxProfit.maxProfit(new int[] {4, 5, 8, 10, 1, 2, 3});
        Assertions.assertEquals(6, profit);
    }

}
