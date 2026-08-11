class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];
        
        // Base case: dp[0] is false (default in Java booleans)
        
        for (int i = 1; i <= n; i++) {
            // Try all possible square numbers k*k <= i
            for (int k = 1; k * k <= i; k++) {
                // If leaving (i - k*k) stones puts the next player in a losing state,
                // then the current player wins!
                if (!dp[i - k * k]) {
                    dp[i] = true;
                    break; // No need to check further square numbers for this 'i'
                }
            }
        }
        
        return dp[n];
    }
}