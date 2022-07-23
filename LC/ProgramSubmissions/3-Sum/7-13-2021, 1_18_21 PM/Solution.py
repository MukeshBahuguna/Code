// https://leetcode.com/problems/3sum

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        #didn't use dict because of sorted output
        nums.sort()
        res=set()
        for i in range(len(nums)):
            target=0-nums[i]
            d={}
            for j in range(i+1,len(nums)):
                x=target-nums[j]
                if x in d:
                    res.add((nums[i],nums[j],nums[d[x]]))
                else:
                    d[nums[j]]=j
                    
        return res
        
