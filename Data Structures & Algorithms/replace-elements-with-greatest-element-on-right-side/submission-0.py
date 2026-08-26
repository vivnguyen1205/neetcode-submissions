class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        
        res = []
        for i in range(len(arr)):
            maxnum = -1
        
                
            for j in range(i+1, len(arr)):
                
                maxnum = max(maxnum, arr[j])
            res.append(maxnum)
        return res
            


            
        