class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict = {}

        for i in strs:
            k = ''.join(sorted(i))
            try:
                dict[k].append(i)
            except KeyError:
                dict[k] = [i]

        ans = []
        for i in dict:
            ans.append(dict[i])
        return ans
