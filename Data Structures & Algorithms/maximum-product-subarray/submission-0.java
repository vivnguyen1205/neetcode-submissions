class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0]; // this will the the variable for the maxprod
      
        for(int i = 0; i<nums.length; i++){ // iterating t
            int current = 1; // the value at the current index i 
            
            for(int j = i; j<nums.length;j++){ // start at the second one and 
                
                current *=nums[j];
               

                maxProd = Math.max(maxProd, current);


            }
        }
        return maxProd;
        
    }
}
