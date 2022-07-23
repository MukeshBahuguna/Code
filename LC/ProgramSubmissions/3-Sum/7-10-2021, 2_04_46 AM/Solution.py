// https://leetcode.com/problems/3sum

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        #didn't use dict because of sorted output
        nums.sort()
        res=set()
        for i in range(len(nums)):
            target=0-nums[i]
            l=i+1
            r=len(nums)-1
            while l<r:
                if (nums[l]+nums[r])==target:
                    if (nums[i],nums[l],nums[r]) not in res:
                        res.add((nums[i],nums[l],nums[r]))
                        
                    l+=1
                    r-=1
                elif (nums[l]+nums[r])<target:
                    l+=1
                else:
                    r-=1
        return res
        
