class Solution(object):
    def rotate(self, nums, k):
        n = len(nums)
        nums.reverse()

        l = k % n 
        for i in range(l//2):
            nums[i], nums[l-i-1] = nums[l-i-1], nums[i]
        for i in range(l, (l + n)//2):
            nums[i], nums[l-i-1] = nums[l-i-1], nums[i]