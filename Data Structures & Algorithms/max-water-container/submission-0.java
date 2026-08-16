class Solution {
    public int maxArea(int[] heights) {
        int mostwater = 0;
        for(int i = 0; i<heights.length; i++){
            for(int j = i+1; j<heights.length; j++){
                int xdist = j-i;
                int height = Math.min(heights[i], heights[j]);

                int wateramount = xdist * height;

                mostwater = Math.max(mostwater, wateramount);
                

            }
           
        }
        return mostwater;

    }
}
