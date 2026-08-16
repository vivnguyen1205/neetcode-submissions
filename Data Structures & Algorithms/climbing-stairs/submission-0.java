class Solution {
    public int climbStairs(int n) {
        int i = 1;
        int j = 1; 
        for(int k = 0; k < n; k++){
            int temp = i;
            i+=j;
            j=temp;
        }
        return j;
        
    }
}
