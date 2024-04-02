class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int s=0 ,ans=0;
        int j=0;
        Map <Integer ,Integer >  m = new HashMap<>();
        m.put(0,1);
        for(int i=0 ; i<n ;i++){
            s+=nums[i];
            if(m.containsKey(s-goal)){
                ans+=m.get(s-goal);   
            }
            m.put(s, m.getOrDefault(s,0)+1);
        }
        return ans;
    }
}