class Solution {
    public int maxArea(int[] heights) {
        int l = 0; // left pointer at index 0
        int r = heights.length -1 ; // right pointer starts at the last value in array 
        int maxWat = 0; // set default max value is 0;
        while(l < r ){ // while left is less than right 
            int area = (r-l) * Math.min(heights[l], heights[r]); // compute the area for every combo of l and r 
            maxWat = Math.max(area, maxWat); // if the area is greater than what we currently have, update it 
            if(heights[l]< heights[r]){ // left height is limiting the area so change it 
                l++;
            }
            else{ // right is less than left, right is limiting, decrement it down
                r--;
            }
           
        
        }
        return maxWat; // returning the value
       

    }
}
