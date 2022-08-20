# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        ans=[]
        q=deque()
        if (not root): return [];
        q.append(root)
        flag=True
        while (len(q)>0):
            l=len(q)
            s=[]
            for i in range(l):
                a=q.popleft()
                s.append(a.val)
                
                if a.left:
                    q.append(a.left)
                if a.right:
                    q.append(a.right)
              
            if not flag: ans.append(s[::-1][:])
            else: ans.append(s[:])
            flag=not flag
            
        return ans