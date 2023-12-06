package us.fatehi.leeting;


public class MaximumProfit {
    
    public static void main(String[] args) {
        MaximumProfit maxProfit = new MaximumProfit();

        int profit = maxProfit.maxProfit(new int[] {1, 2, 4, 5, 8, 10});
        boolean checkEquals1 = profit == 9;    
        System.out.println(checkEquals1);
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0; // No profit can be made with less than two days of prices
        }

        int minPrice = prices[0]; // Initialize the minimum price
        int maxProfit = 0; // Initialize the maximum profit

        for (int i = 1; i < prices.length; i++) {
            // Update the minimum price if a lower price is found
            minPrice = Math.min(minPrice, prices[i]);

            // Update the maximum profit if a better selling day is found
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;        
    }

}
