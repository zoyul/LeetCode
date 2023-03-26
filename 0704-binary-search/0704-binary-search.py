class Solution(object):
    def search(self, nums, target):

        left, right = 0, len(nums)
        ans = -1
        while left < right:
            mid = (left + right) // 2
            if nums[mid] < target:
                left += 1
            elif nums[mid] > target:
                right -= 1
            else:
                ans = mid
                break

        return ans
