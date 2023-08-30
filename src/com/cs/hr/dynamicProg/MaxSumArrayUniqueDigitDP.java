package com.cs.hr.dynamicProg;

public class MaxSumArrayUniqueDigitDP {
    static int []dp = new int [1024];

    // Function to create mask for every number
    static int get_binary(int u)
    {
        int ans = 0;
        while (u > 0)

        {
            int rem = u % 10;
            ans |= (1 << rem);
            u /= 10;
        }

        return ans;
    }

    // Recursion for Filling DP array
    static int recur(int u, int []array, int n)
    {
        // Base Condition
        if (u == 0)
            return 0;
        if (dp[u] != -1)
            return dp[u];

        for (int i = 0; i < n; i++)
        {
            int mask = get_binary(array[i]);

            // Recurrence Relation
            if ((mask | u) == u)
            {
                dp[u] = Math.max(Math.max(0,dp[u ^ mask]) + array[i], dp[u]);
            }
        }

        return dp[u];
    }

    // Function to find Maximum Subset Sum
    static int solve(int []array, int n)
    {
        // Initialize DP array
        for (int i = 0; i < (1 << 10); i++)
        {
            dp[i] = -1;
        }

        int ans = 0;

        // Iterate over all possible masks of 10 bit number
        for (int i = 0; i < (1 << 10); i++)
        {
            ans = Math.max(ans, recur(i, array, n));
        }

        return ans;
    }

    // Driver Code
    static public void main (String[] args)
    {
        int []array = { 22, 132, 4, 45, 12, 223 };
        int n = array.length;
        System.out.println(solve(array, n));
    }
}
