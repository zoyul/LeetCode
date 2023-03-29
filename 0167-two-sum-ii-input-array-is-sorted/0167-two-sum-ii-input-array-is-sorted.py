class Solution(object):
    def twoSum(self, numbers, target):
        left, right = 0, len(numbers)-1
        
        while left < right:
            sum_nums = numbers[left] + numbers[right]
            if sum_nums < target:
                left += 1
            elif sum_nums > target:
                right -= 1
            else:
                return [left+1, right+1]