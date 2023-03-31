class Solution(object):
    def sortedSquares(self, nums):
        ans = []
        for num in nums:
            ans.append(num**2)
        ans.sort()

        return ans