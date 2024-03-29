package us.fatehi.leeting.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Coin Change.
 * 
 * https://leetcode.com/problems/coin-change/
 */
public abstract class ProblemCoinChange implements Problem {

    public abstract int coinChange(int[] coins, int amount);

    @Test
    public void testImplementation() {

        ProblemCoinChange coinChange = (ProblemCoinChange) solutionObject();

        int coins;

        coins = coinChange.coinChange(new int[] {}, 0);
        Assertions.assertEquals(0, coins, "Empty Coins and Amount");

        coins = coinChange.coinChange(new int[] {1, 2, 5}, 0);
        Assertions.assertEquals(0, coins, "No Amount");

        coins = coinChange.coinChange(new int[] {2}, 3);
        Assertions.assertEquals(-1, coins, "No Possible Combination");

        coins = coinChange.coinChange(new int[] {2}, 2);
        Assertions.assertEquals(1, coins, "Single Coin of Value Equal to Amount");

        coins = coinChange.coinChange(new int[] {1, 2, 5}, 2);
        Assertions.assertEquals(1, coins, "Multiples Coins of Value Equal to Amount");

        coins = coinChange.coinChange(new int[] {1, 2, 2}, 4);
        Assertions.assertEquals(2, coins, "Repeated Coin Values");

        coins = coinChange.coinChange(new int[] {1, 2, 5}, 11);
        Assertions.assertEquals(3, coins, "Optimal Combination");

        coins = coinChange.coinChange(new int[] {186, 419, 83, 408}, 6249);
        Assertions.assertEquals(20, coins, "Combination with Smaller Coins");
    }

}
