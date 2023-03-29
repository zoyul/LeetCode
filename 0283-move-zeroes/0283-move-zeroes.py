class Solution(object):
    def moveZeroes(self, nums):
        cnt = 0
        i= 0
        while i < len(nums):
            if nums[i] == 0:
                nums.pop(i)
                cnt += 1
            else:
                i += 1
        nums += [0] * cnt
        