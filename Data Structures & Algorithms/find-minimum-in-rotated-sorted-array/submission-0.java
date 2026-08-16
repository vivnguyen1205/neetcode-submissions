class Solution {
    public int findMin(int[] nums) {
        // implementing binary search to find minimum 
        int ans = nums[0];
        for(int i = 0; i<nums.length;i++){
            ans = Math.min(ans,nums[i]);
            
        }
        return ans;

        
    }
}
