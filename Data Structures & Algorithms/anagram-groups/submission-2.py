class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list) #dict but if there is no value it defaults to something 

        for s in strs: 
            sortedS = ''.join(sorted(s)) # 'aet'
            res[sortedS].append(s) # aet - eat, tea
        return list(res.values())

        
            
            

        