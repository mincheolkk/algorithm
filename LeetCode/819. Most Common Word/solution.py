import re

class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        s = re.sub(r'[^\w]', ' ', paragraph)
        s_list = [s for s in s.lower().split(' ') if s not in banned]
        dict = {}
        
        for i in s_list:
            if i:
                count = 1
                try:
                    dict[i] = dict[i] + count
                except KeyError:
                    dict[i] = count

        ans = [k for k,v in dict.items() if max(dict.values()) == v]
        return ans[0]
