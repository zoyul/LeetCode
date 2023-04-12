class Solution(object):
    def simplifyPath(self, path):
        
        stack = []
        split_path = path.split("/")
        print(split_path)
        for p in split_path:
            if p == "." or not p:
                continue
            elif p == "..":
                if stack:
                    stack.pop(-1)
            else:
                stack.append(p)
        
        return "/" + "/".join(stack)