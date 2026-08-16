class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        for(int i = 0; i<heights.length;i++){
            for(int j = 1;j<heights.length;j++){
                int x = j-i;
                int y = Math.min(heights[i], heights[j]);
                int curr = x * y;
                maxWater = Math.max(maxWater,curr);
                
            }
        }
        return maxWater;
        
       

    }
}
