class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n= nums.length;
        List<Integer> l =new ArrayList<>();
        int c=0 ,c1=0,t=0;
        for(int i=0; i<n ;i++){
            if(nums[i] <  target) c+=1;
            else if(nums[i] > target) c1+=1;
        }
        t=c+c1;
        for(int i=0 ;i<n-t ;i++){
            l.add(c);
            c+=1;
        }
        return l;
    }
}