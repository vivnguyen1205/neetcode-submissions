class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)
        for s in strs:
            count = [0] * 26
            for c in s:
                # incrementing for the index of each letter in the string 
                count[ord(c) - ord('a')] += 1 
                # adding each tuple 
            res[tuple(count)].append(s)
        return list(res.values())
        