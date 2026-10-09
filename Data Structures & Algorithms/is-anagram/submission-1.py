class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        d, d1 = {}, {}

        if len(s)!=len(t):
            return False
        
        for i in range(len(s)):
            d[s[i]] = 1+ d.get(s[i],0)
            d1[t[i]] = 1+ d1.get(t[i],0)
        return d1==d

        