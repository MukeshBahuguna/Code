// https://leetcode.com/problems/4sum

class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        nums.sort() # as we need sorted order in output
        l=set()
        
        def bs(s,y):
            i=0
            j=len(s)
            while i<j:
                mid=(i+j)//2
                if s[mid]==y:
                    return True
                elif s[mid]<y:
                    i=mid+1
                else:
                    j=mid
            return False
            
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                for k in range(j+1,len(nums)):
                    x=nums[i]+nums[j]+nums[k]
                    y=target-x
                    if bs(nums[k+1:],y):
                        l.add((nums[i],nums[j],nums[k],y))
                        
        return list(l)