class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1]; // creating array of size n+1
        for(int i = 1; i<=n; i++){ // for every value up to n
            dp[i]= dp[i>> 1] + (i & 1); // dp at index i is the dp value of it minus the offset computed by >>1 and then aded with 
           // dp[i>>1] essentially is getting the value of dp[i - offset]
            // i& 1 checks whether the least sig bit (rightmost ) is a one, if one i&1 is 1 and if even i&1 is 0.
        }            
        return dp;
        }


    }

