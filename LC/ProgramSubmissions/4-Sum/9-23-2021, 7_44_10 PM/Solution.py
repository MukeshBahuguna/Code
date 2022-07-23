// https://leetcode.com/problems/4sum

class Solution:
    def fourSum(self, arr: List[int], k: int) -> List[List[int]]:
        arr.sort()
        n=len(arr)
        listt=set()
        for i in range(0,n-3):
            for j in range(i+1,n-2):
                x=k-arr[i]-arr[j]
                l=j+1
                r=n-1
                while l<r:
                    if arr[l]+arr[r]== x:
                        temp=[arr[i],arr[j],arr[l],arr[r]]
                        temp.sort()
                        listt.add(tuple(temp))
                        l+=1
                        r-=1
                    
                    elif arr[l]+arr[r]< x:
                        l+=1
                        
                    else:
                        r-=1
        return listt