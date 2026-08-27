class Solution:
    def countElements(self, arr: List[int]) -> int:
        arrset = set(arr)
        count = 0
        for x in arr: 
            if x+1 in arrset:
                count+=1
        return count


        