class Solution(object):
    def isValid(self, s):
        stack = []
        
        for ch in s:
            if ch == "(" or ch == "{" or ch == "[":
                stack.append(ch)
            else:
                if stack:
                    if (ch == ")" and stack[-1] == "(") or (ch == "}" and stack[-1] == "{") or (ch == "]" and stack[-1] == "["):
                        stack.pop(-1)
                    else:
                        return False
                else:
                    return False
        
        if stack:
            return False
        else:
            return True