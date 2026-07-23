//Dynamic programming approach to solve the problem of finding the minimum number of coins required to make a given amount using a set of coin denominations.
public class Recursion_24 {
    public static int minCoins(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 3, 4};
        int amount = 6;
        System.out.println("Minimum coins required: " + minCoins(coins, amount));
    }
}
