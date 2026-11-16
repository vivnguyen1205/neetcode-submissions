class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l = 0
        r = len(nums) -1

        while l<=r:
            # (l + r) // 2 can lead to overflow
            m = l + ((r-l)//2)

            if nums[m] > target:
                # if the middle number is greater than the target num
                r = m-1 # move the upper bound to the middle to search botton half
            elif nums[m]< target:
                l = m+1 # if m is less than the target sum, move the lower bound to the middle to search the top half 
            else: # if nums[m] == target
                return m
        return -1 # doesnt exist
             


    

        