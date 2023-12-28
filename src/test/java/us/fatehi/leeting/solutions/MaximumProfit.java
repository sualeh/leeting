package us.fatehi.leeting.solutions;

import us.fatehi.leeting.problems.ProblemMaximumProfit;


public class MaximumProfit extends ProblemMaximumProfit {


    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0; // No profit can be made with less than two days of prices
        }

        int minPrice = prices[0]; // Initialize the minimum price
        int maxProfit = 0; // Initialize the maximum profit

        for (int i = 1; i < prices.length; i++) {
            // Update the minimum price if a lower price is found
            // (This is for future reference, in case we get a later price that has
            // a higher profit.)
            minPrice = Math.min(minPrice, prices[i]);

            // Update the maximum profit if a better selling day is found
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }

    @Override
    public ProblemMaximumProfit solutionObject() {
        return new MaximumProfit();
    }

}
