class Solution(object):
    def removeStars(self, s):
        
        stack = []
        for ch in s:
            if ch == "*" and stack:
                stack.pop(-1)
            else:
                stack.append(ch)
                
        return "".join(stack)