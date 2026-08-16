class Solution {
    public int maxProfit(int[] prices) {
         int maxprof = 0;

         for(int i = 0; i<prices.length;i++){
     
            for(int j = i+1; j<prices.length; j++){
                int temp = prices[j] - prices[i];
                 maxprof = Math.max(temp, maxprof);
            }
           

         }
         return maxprof;
    }
}
