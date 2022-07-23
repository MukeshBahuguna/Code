// https://leetcode.com/problems/3sum-closest

class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        minn=float("inf")
        ans=0
        n=len(nums)
        
        for i in range(n-2):
            
            l=i+1
            r=n-1
            while l<r:
                x=nums[i]+nums[l]+nums[r]
                if x==target:
                    return target
                elif x<target:
                    if abs(x-target)<=minn:
                        minn=abs(x-target)
                        ans=x
                    l+=1
                else:
                    if abs(x-target)<=minn:
                        minn=abs(x-target)
                        ans=x
                    r-=1
        return ans