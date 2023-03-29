class Solution(object):
    def twoSum(self, numbers, target):
        left, right = 0, len(numbers)-1
        sum_nums = numbers[left] + numbers[right]
        while sum_nums != target:
            if sum_nums < target:
                sum_nums -= numbers[left]
                left += 1
                sum_nums += numbers[left]
            elif sum_nums > target:
                sum_nums -= numbers[right]
                right -= 1
                sum_nums += numbers[right]
        return [left+1, right+1]
                
        